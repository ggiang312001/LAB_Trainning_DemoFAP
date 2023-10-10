/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

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
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "majorId")
    private List<Subject> subjects;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "majorId")
    private List<User> users;
}
