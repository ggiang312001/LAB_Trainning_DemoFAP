package lab.training.project.demo_fap.repository;

import lab.training.project.demo_fap.Entities.StudentGrade;
import lab.training.project.demo_fap.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentGradeRepository extends JpaRepository<StudentGrade, Integer> {
    public Iterable<StudentGrade> findByStudentId(User userId);
}
