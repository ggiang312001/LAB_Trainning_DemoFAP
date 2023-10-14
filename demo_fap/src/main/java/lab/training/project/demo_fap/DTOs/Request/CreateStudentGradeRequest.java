/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.DTOs.Request;

import lombok.*;

/**
 *
 * @author phamminhgiang
 */
//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentGradeRequest {
    private int studentId;
    private int gradeId;
    private float value;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
