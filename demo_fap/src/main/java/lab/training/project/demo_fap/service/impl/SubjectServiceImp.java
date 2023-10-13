package lab.training.project.demo_fap.service.impl;

import lab.training.project.demo_fap.Entities.Major;
import lab.training.project.demo_fap.Entities.Semester;
import lab.training.project.demo_fap.Entities.Subject;
import lab.training.project.demo_fap.repository.SubjectRepository;
import lab.training.project.demo_fap.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectServiceImp implements SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public Iterable<Subject> getAllSubject() {
        return subjectRepository.findAll();
    }

    @Override
    public Iterable<Subject> findBySemesterIdAndMajorId(Semester semesterId, Major majorId) {
        return subjectRepository.findBySemesterIdAndMajorId(semesterId, majorId);
    }

    @Override
    public Iterable<Subject> findByMajorId(Major majorId) {
        return subjectRepository.findByMajorId(majorId);
    }

    @Override
    public Optional<Subject> getBySubjectId(int subjectId) {
        return subjectRepository.findById(subjectId);
    }
}
