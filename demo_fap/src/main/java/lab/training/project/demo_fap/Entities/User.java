/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import lombok.*;

/**
 *
 * @author kennybk
 */
@Entity
@Table(name = "User")
//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    @ToString.Exclude //add toString to ignore error stackOverFlow
    private int userId;
    
    @Column(name = "user_code")
    private String userCode;
    
    @Column(name = "username")
    private String username;
    
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
//    @ToString.Exclude //add toString to ignore error stackOverFlow
    private Role roleId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId", fetch = FetchType.EAGER)
    private List<StudentGrade> studentGrades;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacherId", fetch = FetchType.EAGER)
    private List<Subject> subjects;

    public Major getMajorId() {
        return majorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Class getClassId() {
        return classId;
    }

    @Override
    public String toString() {
        return "User{" +
                "classId=" + classId +
                '}';
    }

    //    public int getUserId() {
//        return userId;
//    }
//
//    public String getUserCode() {
//        return userCode;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public String getImg() {
//        return img;
//    }
//
//    public LocalDate getDob() {
//        return dob;
//    }
//
//    public boolean isGender() {
//        return gender;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
}
