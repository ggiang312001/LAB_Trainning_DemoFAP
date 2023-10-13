package lab.training.project.demo_fap.service.impl;

import lab.training.project.demo_fap.Entities.StudentGrade;
import lab.training.project.demo_fap.Entities.Subject;
import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.repository.StudentGradeRepository;
import lab.training.project.demo_fap.service.StudentGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentGradeServiceImp implements StudentGradeService {

    @Autowired
    StudentGradeRepository studentGradeRepository;

    @Override
    public Iterable<StudentGrade> getAllStudentGrade(User user) {
        return studentGradeRepository.findByStudentId(user);
    }

    @Override
    public Iterable<StudentGrade> findBySubjectId(Subject subjectId) {
        return studentGradeRepository.findBySubjectId(subjectId);
    }
}
