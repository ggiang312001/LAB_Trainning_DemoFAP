/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.repository;

import java.util.List;
import lab.training.project.demo_fap.Entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author phamminhgiang
 */
@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{
    
    @Query(value = "Select s from s where s.User.userId = ?1 and s.Semester.semesterId = ?2")
    List<Subject> getSubjectByLectureIdAndSemesterId(int lectureId, int subjectId);
}
