package lab.training.project.demo_fap.service;

import lab.training.project.demo_fap.Entities.StudentGrade;
import lab.training.project.demo_fap.Entities.Subject;
import lab.training.project.demo_fap.Entities.User;
import java.util.List;
import lab.training.project.demo_fap.DTOs.Request.CreateStudentGradeRequest;
import lab.training.project.demo_fap.Entities.Class;
import lab.training.project.demo_fap.Entities.Grade;
import org.springframework.stereotype.Service;

@Service
public interface StudentGradeService {
    public Iterable<StudentGrade> getAllStudentGrade(User user);

    public Iterable<StudentGrade> findBySubjectId(Subject subjectId);
    
    List<StudentGrade> findByClass(int semesterId, int subjectId, int classId);
    
    List<User> findListStudent(int semesterId, int subjectId, int classId);
    
    List<Grade> findListGrade(int semesterId, int subjectId, int classId);
    
    StudentGrade addStudentGrade(CreateStudentGradeRequest request, int subjectId);
}
