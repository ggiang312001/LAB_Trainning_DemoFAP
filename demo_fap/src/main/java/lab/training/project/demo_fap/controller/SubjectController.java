/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.controller;

import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.impl.UserDetailsImpl;
import lab.training.project.demo_fap.service.SemesterService;
import lab.training.project.demo_fap.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author phamminhgiang
 */
@RestController
@RequestMapping("/subject")
public class SubjectController {
    
    @Autowired
    private SubjectService subjectService;
    
    @Autowired
    private SemesterService semesterService;
    
    
    
    @GetMapping
    public ModelAndView getSubject(@RequestParam(name = "semesterId", required = true) Integer semesterId){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Lecture/subject.jsp");
        
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        User user = ((UserDetailsImpl)principal).getUser();
        
        mv.addObject("listSubject", subjectService.getSubjectByLectureAndSemester(1, semesterId));
        mv.addObject("semester", semesterService.findById(semesterId));
        return mv;
    }
}
