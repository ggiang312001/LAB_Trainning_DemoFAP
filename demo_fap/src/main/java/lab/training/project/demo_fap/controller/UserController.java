package lab.training.project.demo_fap.controller;

import lab.training.project.demo_fap.Entities.Role;
import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/profile/{user_id}")
    public ModelAndView viewProfile(@PathVariable int user_id){

        Iterable<User> listUser = userService.getAllUser();

        User user = userService.findByUserId(user_id);

        ModelAndView mv = new ModelAndView();
//        mv.setViewName("/view/user_profile.jsp");

        mv.setViewName("/view/profile.jsp");
        mv.addObject("userList", listUser);
        mv.addObject("user", user);

        return mv;
    }
}
