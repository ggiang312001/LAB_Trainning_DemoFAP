/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.service;

import java.util.List;
import lab.training.project.demo_fap.Entities.User;
import org.springframework.stereotype.Service;

/**
 *
 * @author kennybk
 */
@Service
public interface UserService {
    List<User> getStudentByClass(int classId);
}
