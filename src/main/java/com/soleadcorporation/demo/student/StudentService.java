package com.soleadcorporation.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {

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
