package lab.training.project.demo_fap.service;

import lab.training.project.demo_fap.Entities.Major;
import lab.training.project.demo_fap.Entities.Semester;
import lab.training.project.demo_fap.Entities.Subject;

import java.util.Optional;

public interface SubjectService {

    Iterable<Subject> getAllSubject();

    Iterable<Subject> findBySemesterIdAndMajorId(Semester semesterId, Major majorId);

    Iterable<Subject> findByMajorId(Major majorId);

    public Optional<Subject> getBySubjectId(int subjectId);
}
