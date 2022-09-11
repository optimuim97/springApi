package com.soleadcorporation.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student sidik = new Student(
                    "Sidik",
                    "assidikouattara@gmail.com",
                    LocalDate.of(1997, Month.JANUARY,
                            28));

            Student ouattara = new Student(
                    "Ouattara", "ouattara@gmail.com",
                    LocalDate.of(1997, Month.JANUARY, 28));

            repository.saveAll(List.of(sidik, ouattara));
        };
    }
}
