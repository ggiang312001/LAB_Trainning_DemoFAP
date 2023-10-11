package lab.training.project.demo_fap.controller;

import lab.training.project.demo_fap.Entities.Major;
import lab.training.project.demo_fap.Entities.Semester;
import lab.training.project.demo_fap.Entities.Subject;
import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping("/view")
    public ModelAndView viewProfile(){

        Semester semester = new Semester();
        semester.setSemesterId(1);
        Major major = new Major();
        major.setMajorId(11);


        Iterable<Subject> listSubject;
        listSubject = subjectService.findBySemesterIdAndMajorId(semester, major);

        //test
        System.out.println("list of all subject: "+listSubject);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/view/subject.jsp");
//        mv.addObject("listSubject", listSubject);

        return mv;
    }
}
