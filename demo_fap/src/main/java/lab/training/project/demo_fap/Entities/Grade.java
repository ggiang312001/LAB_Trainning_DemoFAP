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
@Table(name = "Grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grade_id")
    private int gradeId;
    
    @ManyToOne
    @JoinColumn(name = "grade_category_id", referencedColumnName = "grade_category_id")
    private GradeCategory gradeCategoryId;
    
    @Column(name = "grade_name")
    private String gradeName;
    
    @Column(name = "weight")
    private float weight;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gradeId")
    private List<StudentGrade> studentGrades;
    
    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public GradeCategory getGradeCategoryId() {
        return gradeCategoryId;
    }

    public void setGradeCategoryId(GradeCategory gradeCategoryId) {
        this.gradeCategoryId = gradeCategoryId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Grade(GradeCategory gradeCategoryId, String gradeName, float weight) {
        this.gradeCategoryId = gradeCategoryId;
        this.gradeName = gradeName;
        this.weight = weight;
    }
    
    
}
