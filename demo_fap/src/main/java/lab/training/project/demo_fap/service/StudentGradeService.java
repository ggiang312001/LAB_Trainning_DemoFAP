/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.service;

import java.util.List;
import lab.training.project.demo_fap.Entities.StudentGrade;
import lab.training.project.demo_fap.Entities.Class;
import org.springframework.stereotype.Service;

/**
 *
 * @author phamminhgiang
 */
@Service
public interface StudentGradeService {
    
    List<StudentGrade> findByClass(int semesterId, int subjectId, int classId);
}
