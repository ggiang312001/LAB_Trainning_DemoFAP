/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.controller;

import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.impl.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kennybk
 */
@RestController
public class HomeController {
   
    
    @RequestMapping("/login")
    public ModelAndView login(@RequestParam(required = false) String error){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login.jsp");
        mv.addObject("error", error);
        return mv;
    }
    
    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/hello.jsp");
        
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = ((UserDetailsImpl)principal).getUser();
        
        mv.addObject("user", user);
        return mv;
    }
}
