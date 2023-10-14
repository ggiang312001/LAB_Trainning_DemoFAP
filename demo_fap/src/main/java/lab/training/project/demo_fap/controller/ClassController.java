/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.controller;

import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.impl.UserDetailsImpl;
import lab.training.project.demo_fap.service.ClassService;
import lab.training.project.demo_fap.service.SemesterService;
import lab.training.project.demo_fap.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author phamminhgiang
 */
@RestController
@RequestMapping("/class")
public class ClassController {
    
    @Autowired
    private ClassService classService;
    
    @Autowired
    private SemesterService semesterService;
    
    @Autowired
    private SubjectService subjectService;
    
    
    
    @GetMapping()
    public ModelAndView getClassByTeacherAndSemesterAndSubject(@RequestParam(name = "semesterId", required = true) int semesterId,
                                                                @RequestParam(name = "subjectId", required = true) Integer subjectId){
        //get user by userId
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = ((UserDetailsImpl)principal).getUser();

        int userId = user.getUserId();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/WEB-INF/views/Lecture/class.jsp");
        mv.addObject("listClass", classService.getClassByTeacherAndSemesterAndSubject(userId, semesterId, subjectId));
        mv.addObject("semester", semesterService.findById(semesterId));
        mv.addObject("subject", subjectService.findById(subjectId));
        return mv;
    }
    
}
