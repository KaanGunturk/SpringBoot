package com.kagan.cruddemo;

import com.kagan.cruddemo.dao.StudentDAO;
import com.kagan.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {

		Student tempStudent = new Student("kagan","gunturk","yasirkagang@gmail.com");

		studentDAO.save(tempStudent);

		System.out.println("SAVED ID: " + tempStudent.getId());
	}
}
