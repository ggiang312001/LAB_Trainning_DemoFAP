/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.Entities;

import jakarta.persistence.*;

import java.util.List;

import lombok.*;

/**
 *
 * @author kennybk
 */
@Entity
@Table(name = "Class")
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private int classId;
    
    @Column(name = "class_name")
    private String className;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classId", fetch = FetchType.EAGER)
    private List<User> users;
}
