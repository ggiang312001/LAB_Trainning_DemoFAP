/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.controller;

import lab.training.project.demo_fap.service.SemesterService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author phamminhgiang
 */
@RestController
@RequestMapping("/semester")
public class SemesterController {
    
    @Autowired
    private SemesterService semesterService;
    
    @GetMapping()
    public ModelAndView getAllSemester(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/WEB-INF/views/Lecture/semester.jsp");
//        mv.setViewName("login.jsp");
        mv.addObject("listSemester", semesterService.getAll());
        return mv;
    }
  
}
