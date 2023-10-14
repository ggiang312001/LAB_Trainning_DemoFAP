/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.service;

import java.util.List;
import org.springframework.stereotype.Service;
import lab.training.project.demo_fap.Entities.Class;

/**
 *
 * @author phamminhgiang
 */
@Service
public interface ClassService {
    
    List<Class> getClassByTeacherAndSemesterAndSubject(int teacherId, int semesterId, int subjectId);
    
    Class findById(int classId);
}
