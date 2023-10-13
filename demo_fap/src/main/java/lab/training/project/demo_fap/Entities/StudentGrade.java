/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

/**
 *
 * @author kennybk
 */
@Entity
@Table(name = "StudentGrade")
//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentGrade {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "student_grade_id")
   private int studentGradeId;
   
   @ManyToOne
   @JoinColumn(name = "student_id", referencedColumnName = "user_id")
   private User studentId;
   
   @ManyToOne
   @JoinColumn(name = "grade_id", referencedColumnName = "grade_id")
   private Grade gradeId;
   
   @Column(name = "value")
   private float value;

   @ManyToOne
   @JoinColumn(name = "subject_id", referencedColumnName = "subject_id")
   private Subject subjectId;



}
