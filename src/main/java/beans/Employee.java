package beans;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee extends   Person {


    @Column(name = "Employee_Job",nullable = false)
    private String job;

    @Column(name = "Employee_Sal",nullable = false)
    private double sal;
}
