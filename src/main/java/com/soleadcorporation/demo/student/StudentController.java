package com.soleadcorporation.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        List<Student> students = List.of(
                new Student(
                        "Sidik",
                        "assidikouattara@gmail.com",
                        LocalDate.of(1997, Month.SEPTEMBER, 28),
                        25
                )
        );

        return students;
    }
}
