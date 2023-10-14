/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.service;

import java.util.List;
import lab.training.project.demo_fap.Entities.Semester;
import org.springframework.stereotype.Service;

@Service
public interface SemesterService {

    //get all semester
    Iterable<Semester> getAllSemesters();
    List<Semester> getAll();
    Semester findById(int id);
}
