package lab.training.project.demo_fap.controller;

import lab.training.project.demo_fap.Entities.*;
import lab.training.project.demo_fap.Entities.Class;
import lab.training.project.demo_fap.impl.UserDetailsImpl;
import lab.training.project.demo_fap.service.StudentGradeService;
import lab.training.project.demo_fap.service.SubjectService;
import lab.training.project.demo_fap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    StudentGradeService studentGradeService;

    @Autowired
    SubjectService subjectService;



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

    @GetMapping("/grade/{subject_id}")
    public ModelAndView viewGrade(@PathVariable int subject_id){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = ((UserDetailsImpl)principal).getUser();

        ModelAndView mv = new ModelAndView();

        //get user's majorId
        Major major = user.getMajorId();

        //get list of subject by majorId
        Iterable<Subject> listSubject = subjectService.findByMajorId(major);

        Optional<Subject> optionalSubject = subjectService.getBySubjectId(subject_id);

        Subject subject = optionalSubject.orElse(null); // Lấy giá trị bên trong Optional hoặc trả về null nếu Optional rỗng

        //get studentGradeId object
        Iterable<StudentGrade> studentGrade = studentGradeService.findBySubjectId(subject);

        mv.setViewName("/view/grade.jsp");

        mv.addObject("studentGrade", studentGrade);

        mv.addObject("listSubject", listSubject);

        return mv;
    }

}
