package beans;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student extends   Person {


    @Column(name = "Student_Course",nullable = false)
    private String course;

    @Column(name = "Student_Fees",nullable = false)
    private double fees;
}
