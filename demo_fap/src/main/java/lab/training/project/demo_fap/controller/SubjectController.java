package lab.training.project.demo_fap.controller;

import lab.training.project.demo_fap.Entities.Major;
import lab.training.project.demo_fap.Entities.Semester;
import lab.training.project.demo_fap.Entities.Subject;
import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.service.SemesterService;
import lab.training.project.demo_fap.service.SubjectService;
import lab.training.project.demo_fap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @Autowired
    UserService userService;

    @Autowired
    SemesterService semesterService;

    @GetMapping("/view")
    public ModelAndView viewProfile(){

        //get user by userId
        User user = userService.findByUserId(1);

        //get user's majorId
        Major major = user.getMajorId();

        //get all semester(semester id and semester code, name) to a iterable
        Iterable<Semester> listSemester = semesterService.getAllSemesters();

        //set default semester
        Semester semester = new Semester();

        //create a list of semester
        List<Semester> semesterList = new ArrayList<>();

        //change iterable of semester to list
        for (Semester semes : listSemester) {
            semesterList.add(semes);
        }

        //get first semester
        if (!semesterList.isEmpty()) {
            semester = semesterList.get(0);
        }

        //show user's subject by their majorId and current semester

        //get subject with majorId of user and default semester
        Iterable<Subject> listSubject;
        listSubject = subjectService.findBySemesterIdAndMajorId(semester, major);

        //test listSubject
        System.out.println("list of all subject: "+listSubject);

        //model view
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/view/subject.jsp");

        //add object listSubject
        mv.addObject("listSubject", listSubject);

        //add Object listSemester
        mv.addObject("listSemester", listSemester);

        return mv;
    }
}
