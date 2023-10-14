/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.repository;

import java.util.List;
import lab.training.project.demo_fap.Entities.StudentGrade;
import lab.training.project.demo_fap.Entities.Class;
import lab.training.project.demo_fap.Entities.Grade;
import lab.training.project.demo_fap.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
       "AND :classes MEMBER OF sg.subjectId.classes")
    List<StudentGrade> findByClass(int semesterId, int subjectId, Class classes);
//    List<StudentGrade> findByClass(@Param("semesterId") int semesterId,@Param("subjectId") int subjectId,@Param("classes") Class classes);
    
    @Query("SELECT sg.gradeId FROM StudentGrade sg " +
            "WHERE sg.subjectId.semesterId.semesterId = :semesterId " +
            "AND sg.subjectId.subjectId = :subjectId " +
            "AND :classes MEMBER OF sg.subjectId.classes group by sg.gradeId")
    List<Grade> listGrade(int semesterId, int subjectId, Class classes);

    @Query("SELECT sg.studentId FROM StudentGrade sg " +
            "WHERE sg.subjectId.semesterId.semesterId = :semesterId " +
            "AND sg.subjectId.subjectId = :subjectId " +
            "AND :classes MEMBER OF sg.subjectId.classes group by sg.studentId")
    List<User> listStudent(int semesterId, int subjectId, Class classes);
    
}

