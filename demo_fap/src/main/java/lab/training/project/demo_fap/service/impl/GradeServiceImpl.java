/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.service.impl;

import java.util.List;
import lab.training.project.demo_fap.Entities.Grade;
import lab.training.project.demo_fap.repository.GradeRepository;
import lab.training.project.demo_fap.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author phamminhgiang
 */
@Service
public class GradeServiceImpl implements GradeService{
    
    @Autowired
    private GradeRepository gradeRepository;

    @Override
    public List<Grade> getAll() {
        return gradeRepository.findAll();
    }
    
}
