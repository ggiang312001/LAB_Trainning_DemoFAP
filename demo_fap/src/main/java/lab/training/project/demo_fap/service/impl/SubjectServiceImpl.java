/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.service.impl;

import java.util.List;
import lab.training.project.demo_fap.Entities.Subject;
import lab.training.project.demo_fap.repository.SubjectRepository;
import lab.training.project.demo_fap.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author phamminhgiang
 */
@Service
public class SubjectServiceImpl implements SubjectService{

    @Autowired
    private SubjectRepository subjectRepository;
    
    @Override
    public List<Subject> getSubjectByLectureAndSemester(int lectureId, int semesterId) {
        return subjectRepository.getSubjectByLectureAndSemester(lectureId, semesterId);
    }

    @Override
    public Subject findById(Integer subjectId) {
        return subjectRepository.findById(subjectId).orElseThrow();
    }
    
}
