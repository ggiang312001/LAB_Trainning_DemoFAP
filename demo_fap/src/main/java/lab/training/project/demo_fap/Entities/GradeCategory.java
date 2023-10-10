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
@Table(name = "GradeCategory")
@Data
public class GradeCategory {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "grade_category_id")
   private int gradeCategoryId;
   
   @Column(name = "grade_name")
   private String gradeName;
   
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "gradeCategoryId")
   private List<Grade> grades;

    
}
