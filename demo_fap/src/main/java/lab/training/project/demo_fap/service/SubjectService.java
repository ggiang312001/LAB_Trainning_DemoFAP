package lab.training.project.demo_fap.service;

import lab.training.project.demo_fap.Entities.Major;
import lab.training.project.demo_fap.Entities.Semester;
import lab.training.project.demo_fap.Entities.Subject;

public interface SubjectService {
    Iterable<Subject> findBySemesterIdAndMajorId(Semester semesterId, Major majorId);
}
