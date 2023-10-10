package lab.training.project.demo_fap.Services.Imp;

import lab.training.project.demo_fap.Entities.User;
import lab.training.project.demo_fap.Repositories.UserRepository;
import lab.training.project.demo_fap.Services.UserService;
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
}
