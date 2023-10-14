/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.service.impl;

import java.util.List;
import lab.training.project.demo_fap.repository.ClassRepository;
import lab.training.project.demo_fap.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lab.training.project.demo_fap.Entities.Class;

/**
 *
 * @author phamminhgiang
 */
@Service
public class ClassServiceImpl implements ClassService{

    @Autowired
    private ClassRepository classRepository;
    
    @Override
    public List<Class> getClassByTeacherAndSemesterAndSubject(int teacherId, int semesterId, int subjectId) {
        return classRepository.getClassByTeacherAndSemesterAndSubject(teacherId, semesterId, subjectId);
    }

    @Override
    public Class findById(int classId) {
        return classRepository.findById(classId).orElseThrow();
    }
    
}
