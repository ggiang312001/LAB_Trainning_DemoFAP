package lab.training.project.demo_fap.service.impl;

import lab.training.project.demo_fap.Entities.Semester;
import lab.training.project.demo_fap.repository.SemesterRepository;
import lab.training.project.demo_fap.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemesterServiceImp implements SemesterService {
    @Autowired
    SemesterRepository semesterRepository;

    @Override
    public Iterable<Semester> getAllSemesters() {
        return semesterRepository.findAll();
    }

    @Override
    public List<Semester> getAll() {
        return semesterRepository.findAll();
    }

    @Override
    public Semester findById(int id) {
        return semesterRepository.findById(id).orElseThrow();
    }
}
