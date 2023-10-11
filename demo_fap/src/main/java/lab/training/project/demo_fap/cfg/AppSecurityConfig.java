/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.cfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;

/**
 *
 * @author kennybk
 */
@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

    @Autowired
    private UserDetailsService userDetailsSvc;

    @Bean
    public AuthenticationProvider authProvider() {
        DaoAuthenticationProvider daoProvider = new DaoAuthenticationProvider();

        daoProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        daoProvider.setUserDetailsService(userDetailsSvc);
        return daoProvider;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth
                        -> auth
                        .requestMatchers(antMatcher("/admin/**")).hasRole("TEACHER")
                        .requestMatchers(antMatcher("/student/**")).hasRole("STUDENT")
                        .requestMatchers(antMatcher("/hello")).authenticated()
                        .requestMatchers(antMatcher("/user/profile")).authenticated()
                        .requestMatchers(antMatcher("/subject/view")).authenticated()
                        .anyRequest().permitAll()
                )
                .formLogin(formLogin -> {
                    formLogin.loginPage("/login").permitAll()
                            .loginProcessingUrl("/login")
                            .failureUrl("/login?error=true");
                });

        return httpSecurity.build();
    }
}
