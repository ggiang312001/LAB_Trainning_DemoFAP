/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.service.impl;

import java.util.List;
import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.repository.UserRepository;
import lab.training.project.demo_fap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author phamminhgiang
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public List<User> getStudentByClass(int classId) {
        return userRepository.getStudentByClass(classId);
    }
    
}
