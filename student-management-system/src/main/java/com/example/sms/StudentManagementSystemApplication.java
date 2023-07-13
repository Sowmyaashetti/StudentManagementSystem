package com.example.sms;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Sowmya", "Shetti", "soumyashetti1194@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Jagadish", "Shetti", "jagadishshetti2185@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Aruna", "Shetti", "arunashetti21854@gmail.com");
//		studentRepository.save(student3);
//
//		Student student4 = new Student("Prashanth", "Shetti", "prashanthshetti2185@gmail.com");
//		studentRepository.save(student4);
	}
}
