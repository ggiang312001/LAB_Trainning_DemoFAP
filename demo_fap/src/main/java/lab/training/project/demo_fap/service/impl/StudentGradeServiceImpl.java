/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.service.impl;

import java.util.List;
import lab.training.project.demo_fap.Entities.Class;
import lab.training.project.demo_fap.Entities.StudentGrade;
import lab.training.project.demo_fap.repository.ClassRepository;
import lab.training.project.demo_fap.repository.StudentGradeRepository;
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

    @Override
    public List<StudentGrade> findByClass(int semesterId, int subjectId, int classId) {
        Class classes = new Class();
        classes.setClassId(classId);
        return studentGradeRepository.findByClass(semesterId, subjectId, classes);
    }
    
}
