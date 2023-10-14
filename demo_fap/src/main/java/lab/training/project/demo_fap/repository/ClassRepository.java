/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.repository;

import java.util.List;
import lab.training.project.demo_fap.Entities.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author phamminhgiang
 */
@Repository
public interface ClassRepository extends JpaRepository<Class, Integer>{
    
    @Query("SELECT c FROM Class c " +
           "JOIN c.subjects s " +
           "JOIN s.teacherId t " +
           "JOIN s.semesterId sem " +
           "WHERE t.userId = :teacherId " +
           "AND sem.semesterId = :semesterId " +
           "AND s.subjectId = :subjectId ")
    List<Class> getClassByTeacherAndSemesterAndSubject(int teacherId, int semesterId, int subjectId);
    
}
