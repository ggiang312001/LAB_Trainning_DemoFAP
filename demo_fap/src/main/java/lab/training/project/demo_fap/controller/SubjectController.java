package lab.training.project.demo_fap.controller;

import lab.training.project.demo_fap.Entities.Major;
import lab.training.project.demo_fap.Entities.Semester;
import lab.training.project.demo_fap.Entities.Subject;

import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.impl.UserDetailsImpl;
import lab.training.project.demo_fap.service.SemesterService;
import lab.training.project.demo_fap.service.SubjectService;
import lab.training.project.demo_fap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("semester/{id}")
    public ModelAndView getSubject(@PathVariable int id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/WEB-INF/views/Lecture/subject.jsp");
        
        mv.addObject("listSubject", subjectService.getSubjectByLectureAndSemester(1, id));
        mv.addObject("semester", semesterService.findById(id));
        return mv;
    }

    @GetMapping("/view/{semester_id}")
    public ModelAndView viewProfile(@PathVariable int semester_id){

        //get user by userId
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = ((UserDetailsImpl)principal).getUser();

        System.out.println("USER: "+user);

        //get user's majorId
        Major major = user.getMajorId();

        //get all semester(semester id and semester code, name) to a iterable
        Iterable<Semester> listSemester = semesterService.getAllSemesters();

        //set default semester
        Semester semester = new Semester();

        //test path semester_id
        System.out.println("PATH SEMESTER_ID: "+semester_id);

        //check if semester_id equal 0 -> set default semesterId
        if(semester_id == 0){
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
        }
        //else -> set semester by path semester_id
        else {
            semester.setSemesterId(semester_id);
        }

        //show user's subject by their majorId and current semester

        //get subject with majorId of user and default semester
        Iterable<Subject> listSubject;
        listSubject = subjectService.findBySemesterIdAndMajorId(semester, major);

        //model view
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/view/subject.jsp");

        //add object listSubject
        mv.addObject("listSubject", listSubject);

        //add Object listSemester
        mv.addObject("listSemester", listSemester);
    }
}
