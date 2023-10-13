/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.Entities;

import jakarta.persistence.*;

import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kennybk
 */
@Entity
@Table(name = "Major")
@Data
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "major_id")
    private int majorId;
    
    @Column(name = "major_name")
    private String majorName;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "majorId", fetch = FetchType.EAGER)
    @ToString.Exclude //add toString to ignore error stackOverFlow
    private List<Subject> subjects;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "majorId", fetch = FetchType.EAGER)
    @ToString.Exclude //add toString to ignore error stackOverFlow
    private List<User> users;

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
