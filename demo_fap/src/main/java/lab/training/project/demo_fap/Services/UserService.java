package lab.training.project.demo_fap.Services;

import lab.training.project.demo_fap.Entities.User;
import org.springframework.stereotype.Service;


public interface UserService {
    Iterable<User> getAllUser();
}
