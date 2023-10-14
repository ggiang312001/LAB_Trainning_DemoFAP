package lab.training.project.demo_fap.repository;

import lab.training.project.demo_fap.Entities.Major;
import lab.training.project.demo_fap.Entities.Semester;
import lab.training.project.demo_fap.Entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    public Iterable<Subject> findBySemesterIdAndMajorId(Semester semesterId, Major majorId);

    public Iterable<Subject> findByMajorId(Major majorId);
    
    @Query(value = "Select s from Subject s where s.teacherId.userId = ?1 and s.semesterId.semesterId = ?2")
    List<Subject> getSubjectByLectureAndSemester(int lectureId, int semesterId);
    
    
    
}
