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

/**
 *
 * @author kennybk
 */
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    
    @Column(name = "user_code")
    private String userCode;
    
    @Column(name = "user_name")
    private String img;
    
    @Column(name = "img")
    private LocalDate dob;
    
    @Column(name = "dob")
    private boolean gender;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "password")
    private String password;
    
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
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Major getMajorId() {
        return majorId;
    }

    public void setMajorId(Major majorId) {
        this.majorId = majorId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public User(String userCode, String img, LocalDate dob, boolean gender, String address, String password, Major majorId, Role roleId) {
        this.userCode = userCode;
        this.img = img;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.password = password;
        this.majorId = majorId;
        this.roleId = roleId;
    }
    
    
}
