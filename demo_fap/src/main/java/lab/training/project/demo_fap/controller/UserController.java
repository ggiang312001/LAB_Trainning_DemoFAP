package lab.training.project.demo_fap.controller;

import lab.training.project.demo_fap.Entities.Class;
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

    @GetMapping("/class")
    public ModelAndView viewClass(){

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = ((UserDetailsImpl)principal).getUser();

        ModelAndView mv = new ModelAndView();
//        mv.setViewName("/view/user_profile.jsp");


        //get classId object
        Class classId = user.getClassId();

        System.out.println("CLASS ID : "+classId);

        //get list of user by classId
        Iterable<User> classMember = userService.getUserByClassId(classId);

        //test get user by classId
        System.out.println("CLASS MEMBER LIST: "+classMember);

        mv.setViewName("/view/class.jsp");

        mv.addObject("classMember", classMember);

        return mv;
    }

}
