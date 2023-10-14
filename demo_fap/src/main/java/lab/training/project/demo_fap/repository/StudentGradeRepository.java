/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.repository;

import java.util.List;
import lab.training.project.demo_fap.Entities.StudentGrade;
import lab.training.project.demo_fap.Entities.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author phamminhgiang
 */

@Repository
public interface StudentGradeRepository extends JpaRepository<StudentGrade, Integer>{
    
    @Query("SELECT sg FROM StudentGrade sg " +
       "WHERE sg.subjectId.semesterId.semesterId = :semesterId " +
       "AND sg.subjectId.subjectId = :subjectId " +
       "AND sg.subjectId.classes = :classes")
    List<StudentGrade> findByClass(int semesterId, int subjectId, Class classes);
    
}

