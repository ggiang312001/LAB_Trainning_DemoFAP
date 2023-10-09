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

/**
 *
 * @author kennybk
 */
@Entity
@Table(name = "StudentGrade")
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

    public int getStudentGradeId() {
        return studentGradeId;
    }

    public void setStudentGradeId(int studentGradeId) {
        this.studentGradeId = studentGradeId;
    }

    public User getStudentId() {
        return studentId;
    }

    public void setStudentId(User studentId) {
        this.studentId = studentId;
    }

    public Grade getGradeId() {
        return gradeId;
    }

    public void setGradeId(Grade gradeId) {
        this.gradeId = gradeId;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public StudentGrade(User studentId, Grade gradeId, float value) {
        this.studentId = studentId;
        this.gradeId = gradeId;
        this.value = value;
    }
   
   
}
