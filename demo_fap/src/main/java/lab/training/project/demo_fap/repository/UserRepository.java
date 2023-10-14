/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.repository;

import java.util.List;
import java.util.Optional;
import lab.training.project.demo_fap.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kennybk
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
     public Optional<User> findByUsername(String username);
     
     @Query("SELECT u FROM User u WHERE u.classId.classId = :classId and u.roleId.roleId = 3")
     List<User> getStudentByClass(int classId);
}
