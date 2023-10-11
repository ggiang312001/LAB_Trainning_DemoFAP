package lab.training.project.demo_fap.controller;

import lab.training.project.demo_fap.Entities.Role;
import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.impl.UserDetailsImpl;
import lab.training.project.demo_fap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/profile")
    public ModelAndView viewProfile(){

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = ((UserDetailsImpl)principal).getUser();

        ModelAndView mv = new ModelAndView();
//        mv.setViewName("/view/user_profile.jsp");

        mv.setViewName("/view/profile.jsp");

        mv.addObject("user", user);

        return mv;
    }
}
