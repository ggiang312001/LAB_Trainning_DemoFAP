/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.Entities;

import jakarta.persistence.CascadeType;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

/**
 *
 * @author kennybk
 */
@Entity
@Table(name = "User")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    
    @Column(name = "user_code")
    private String userCode;
    
    @Column(name = "user_name")
    private String userName;
    
    @Column(name = "img")
    private String img;
    
    @Column(name = "dob")
    private LocalDate dob;
    
    @Column(name = "gender")
    private boolean gender;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "email")
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "class_id", referencedColumnName = "class_id")
    private Class classId;
    
    @ManyToOne
    @JoinColumn(name = "major_id", referencedColumnName = "major_id")
    private Major majorId;
    
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    private Role roleId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<StudentGrade> studentGrades;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacherId")
    private List<Subject> subjects;
    
    
}
