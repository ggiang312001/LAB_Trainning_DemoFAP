package lab.training.project.demo_fap.repository;

import lab.training.project.demo_fap.Entities.StudentGrade;
import lab.training.project.demo_fap.Entities.Subject;
import lab.training.project.demo_fap.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentGradeRepository extends JpaRepository<StudentGrade, Integer> {
    public Iterable<StudentGrade> findByStudentId(User userId);

//    @Query(value = "SELECT * FROM StudentGrade WHERE 1 AND subjectId.subjectId = ?1")
    public  Iterable<StudentGrade> findBySubjectId(Subject subjectId);

//    @Query(value = "SELECT * FROM StudentGrade WHERE 1 AND subjectId.subjectId = ?1")
//    public  Iterable<StudentGrade> findBySubject(int subjectId);
}
