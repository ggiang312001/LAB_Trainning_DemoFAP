package lab.training.project.demo_fap.controller;

import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/profile")
    public ModelAndView viewProfile(){

        Iterable<User> listUser;
        listUser = userService.getAllUser();

        System.out.println("list of all users: "+listUser);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/view/user_profile.jsp");
        mv.addObject("userList", listUser);

        return mv;
    }
}
