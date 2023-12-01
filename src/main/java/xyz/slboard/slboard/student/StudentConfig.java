package xyz.slboard.slboard.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {

        return args -> {
            Student thilina = new Student(

                    "Thilina Palamakumbura",
                    "tmbpedu@gmail.com",
                    LocalDate.of(1990, 07, 25)
            );
            Student Nimna = new Student(

                    "Nimna Jayasundara",
                    "nimna@gmail.com",
                    LocalDate.of(1994, 10, 12)
            );

            studentRepository.saveAll(List.of(thilina,Nimna));

        };
    }

}
