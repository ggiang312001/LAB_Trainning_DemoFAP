/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.service.impl;

import java.util.List;
import lab.training.project.demo_fap.DTOs.Request.CreateStudentGradeRequest;
import lab.training.project.demo_fap.Entities.Class;
import lab.training.project.demo_fap.Entities.StudentGrade;
import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.Entities.Grade;
import lab.training.project.demo_fap.repository.ClassRepository;
import lab.training.project.demo_fap.repository.GradeRepository;
import lab.training.project.demo_fap.repository.StudentGradeRepository;
import lab.training.project.demo_fap.repository.SubjectRepository;
import lab.training.project.demo_fap.repository.UserRepository;
import lab.training.project.demo_fap.service.StudentGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author phamminhgiang
 */
@Service
public class StudentGradeServiceImpl implements StudentGradeService{
    
    @Autowired
    private StudentGradeRepository studentGradeRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private GradeRepository gradeRepository;
    
    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<StudentGrade> findByClass(int semesterId, int subjectId, int classId) {
        Class classes = new Class();
        classes.setClassId(classId);
        return studentGradeRepository.findByClass(semesterId, subjectId, classes);
    }
    
    @Override
    public List<User> findListStudent(int semesterId, int subjectId, int classId) {
        Class classes = new Class();
        classes.setClassId(classId);
        return studentGradeRepository.listStudent(semesterId, subjectId, classes);
    }
    
    @Override
    public List<Grade> findListGrade(int semesterId, int subjectId, int classId) {
        Class classes = new Class();
        classes.setClassId(classId);
        return studentGradeRepository.listGrade(semesterId, subjectId, classes);
    }

    @Override
    public StudentGrade addStudentGrade(CreateStudentGradeRequest request, int subjectId) {
        StudentGrade st = new StudentGrade();
        st.setStudentId(userRepository.findById(request.getStudentId()).orElseThrow());
        st.setSubjectId(subjectRepository.findById(subjectId).orElseThrow());
        st.setGradeId(gradeRepository.findById(request.getGradeId()).orElseThrow());
        st.setValue(request.getValue());
        return studentGradeRepository.save(st);
    }
    
    
    
}
