/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.service.impl;

import java.util.List;
import lab.training.project.demo_fap.Entities.Semester;
import lab.training.project.demo_fap.repository.SemesterRepository;
import lab.training.project.demo_fap.service.SemesterService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

/**
 *
 * @author phamminhgiang
 */
@Service
public class SemesterServiceImpl implements SemesterService{
    
    @Autowired
    private SemesterRepository semesterRepository;

    @Override
    public List<Semester> getAll() {
        return semesterRepository.findAll();
    }

    @Override
    public Semester findById(int id) {
        return semesterRepository.findById(id).orElseThrow();
    }
    
}
