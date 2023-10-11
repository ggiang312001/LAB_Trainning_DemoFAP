package lab.training.project.demo_fap.service.impl;

import lab.training.project.demo_fap.Entities.Semester;
import lab.training.project.demo_fap.repository.SemesterRepository;
import lab.training.project.demo_fap.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemesterServiceImp implements SemesterService {
    @Autowired
    SemesterRepository semesterRepository;

    @Override
    public Iterable<Semester> getAllSemesters() {
        return semesterRepository.findAll();
    }
}
