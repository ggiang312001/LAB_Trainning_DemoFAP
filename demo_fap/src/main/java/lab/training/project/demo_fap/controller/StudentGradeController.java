/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.controller;

import java.util.List;
import lab.training.project.demo_fap.DTOs.Request.CreateStudentGradeRequest;
import lab.training.project.demo_fap.Entities.StudentGrade;
import lab.training.project.demo_fap.service.ClassService;
import lab.training.project.demo_fap.service.SemesterService;
import lab.training.project.demo_fap.service.StudentGradeService;
import lab.training.project.demo_fap.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
        mv.addObject("listStudentGrade", studentGradeService.findByClass(semesterId, subjectId, classId));
        mv.addObject("listStudent", studentGradeService.findListStudent(semesterId, subjectId, classId));
        mv.addObject("listGrade", studentGradeService.findListGrade(semesterId, subjectId, classId));
        mv.addObject("semester", semesterService.findById(semesterId));
        mv.addObject("subject", subjectService.findById(subjectId));
        mv.addObject("classs", classService.findById(classId));
        return mv;
    }
    
    @GetMapping("/add")
    public ModelAndView getAddStudentGrades(@RequestParam(name = "semesterId", required = true) int semesterId,
                                        @RequestParam(name = "subjectId", required = true) Integer subjectId,
                                        @RequestParam(name = "classId", required = true) Integer classId){
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/WEB-INF/views/Lecture/addGrade.jsp");

        mv.addObject("semester", semesterService.findById(semesterId));
        mv.addObject("subject", subjectService.findById(subjectId));
        mv.addObject("classs", classService.findById(classId));
        return mv;
    }
    
//    @PostMapping("/add")
//    public ModelAndView AddStudentGrades(@ModelAttribute() CreateStudentGradeRequest request,
//                                            @RequestParam(name = "semesterId", required = true) int semesterId,
//                                            @RequestParam(name = "subjectId", required = true) Integer subjectId,
//                                            @RequestParam(name = "classId", required = true) Integer classId){
    @GetMapping("/addGrade")
    public ModelAndView AddStudentGrades(@RequestParam(name = "semesterId", required = true) int semesterId,
                                            @RequestParam(name = "subjectId", required = true) Integer subjectId,
                                            @RequestParam(name = "classId", required = true) Integer classId,
                                            @RequestParam(name = "studentId", required = true) int studentId,
                                            @RequestParam(name = "gradeId", required = true) int gradeId,
                                            @RequestParam(name = "value", required = true) float value){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/WEB-INF/views/Lecture/studentGrade.jsp");
        
        CreateStudentGradeRequest request = new CreateStudentGradeRequest();
        request.setGradeId(gradeId);
        request.setStudentId(studentId);
        request.setValue(value);
        
        studentGradeService.addStudentGrade(request,subjectId);
        
        mv.addObject("listStudentGrade", studentGradeService.findByClass(semesterId, subjectId, classId));
        mv.addObject("listStudent", studentGradeService.findListStudent(semesterId, subjectId, classId));
        mv.addObject("listGrade", studentGradeService.findListGrade(semesterId, subjectId, classId));
        mv.addObject("semester", semesterService.findById(semesterId));
        mv.addObject("subject", subjectService.findById(subjectId));
        mv.addObject("classs", classService.findById(classId));
        
//        studentGradeService.addStudentGrade(request,subjectId);
//        
//        mv.addObject("listStudentGrade", studentGradeService.findByClass(semesterId, subjectId, classId));
//        mv.addObject("listStudent", studentGradeService.findListStudent(semesterId, subjectId, classId));
//        mv.addObject("listGrade", studentGradeService.findListGrade(semesterId, subjectId, classId));
//        mv.addObject("semester", semesterService.findById(semesterId));
//        mv.addObject("subject", subjectService.findById(subjectId));
//        mv.addObject("classs", classService.findById(classId));
        
        return mv;
    }
    

}
