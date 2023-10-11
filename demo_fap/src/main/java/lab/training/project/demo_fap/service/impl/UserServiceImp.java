package lab.training.project.demo_fap.service.impl;

import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.repository.UserRepository;
import lab.training.project.demo_fap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public Iterable<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findByUserId(int userId) {
        return userRepository.findByUserId(userId);
    }
}
