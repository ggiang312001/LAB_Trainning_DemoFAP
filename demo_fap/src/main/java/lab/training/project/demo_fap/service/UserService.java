package lab.training.project.demo_fap.service;

import lab.training.project.demo_fap.Entities.Class;
import lab.training.project.demo_fap.Entities.User;


public interface UserService {
    Iterable<User> getAllUser();

    Iterable<User> getUserByClassId(Class classId);
}
