/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.controller;

import java.util.List;
import lab.training.project.demo_fap.Entities.StudentGrade;
import lab.training.project.demo_fap.service.ClassService;
import lab.training.project.demo_fap.service.SemesterService;
import lab.training.project.demo_fap.service.StudentGradeService;
import lab.training.project.demo_fap.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/studentGrades")
public class StudentGradeController {
    
    @Autowired
    private StudentGradeService studentGradeService;
    
    @Autowired
    private ClassService classService;
    
    @Autowired
    private SemesterService semesterService;
    
    @Autowired
    private SubjectService subjectService;
    
    @GetMapping()
    public ModelAndView getStudentGrades(@RequestParam(name = "semesterId", required = true) int semesterId,
                                        @RequestParam(name = "subjectId", required = true) Integer subjectId,
                                        @RequestParam(name = "classId", required = true) Integer classId){
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/WEB-INF/views/Lecture/studentGrade.jsp");
//        mv.setViewName("login.jsp");
        mv.addObject("listStudentGrade", studentGradeService.findByClass(semesterId, subjectId, classId));
        mv.addObject("semester", semesterService.findById(semesterId));
        mv.addObject("subject", subjectService.findById(subjectId));
        mv.addObject("class", classService.findById(classId));
        return mv;
    }
    

}
