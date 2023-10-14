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
@RequestMapping("/subject")
public class SubjectController {
    
    @Autowired
    private SubjectService subjectService;
    
    @Autowired
    private SemesterService semesterService;
    
    
    
    @GetMapping("semester/{id}")
    public ModelAndView getSubject(@PathVariable int id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/WEB-INF/views/Lecture/subject.jsp");
//        mv.setViewName("Lecture/semester.jsp");
        mv.addObject("listSubject", subjectService.getSubjectByLectureAndSemester(1, id));
        mv.addObject("semester", semesterService.findById(id));
        return mv;
    }
}
