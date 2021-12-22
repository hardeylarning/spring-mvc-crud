package com.rocktech.sms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication {
	
//	public class StudentManagementSystemApplication implements CommandLineRunner

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
//	@Autowired
//	private StudentRepository repo;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Student st1 = new Student("Roqeeb", "Musibawu", "hardeylarning@gmail.com");
//		repo.save(st1);
//		
//		Student st2 = new Student("Adelani", "Ayinde", "adelani@gmail.com");
//		repo.save(st2);
//		
//		Student st3 = new Student("Ayinde", "Musibawu", "ayinde@gmail.com");
//		repo.save(st3);
//		
//	}

}
