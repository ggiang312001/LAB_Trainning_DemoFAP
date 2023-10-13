package lab.training.project.demo_fap.service;

import lab.training.project.demo_fap.Entities.StudentGrade;
import lab.training.project.demo_fap.Entities.Subject;
import lab.training.project.demo_fap.Entities.User;

public interface StudentGradeService {
    public Iterable<StudentGrade> getAllStudentGrade(User user);

    public Iterable<StudentGrade> findBySubjectId(Subject subjectId);
}
