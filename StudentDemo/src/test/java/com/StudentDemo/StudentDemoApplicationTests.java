package com.StudentDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Repository.Student.RegistrationRepository;


@SpringBootTest
class StudentDemoApplicationTests {

	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Test
	void saveRegistration() {
//		Registration r = new Registration();
//		r.setName("Mike");
//		r.setEmail("mike@gmail.com");
//		r.setMobile("9368277694");
//		registrationRepository.save(r);
		System.out.println(registrationRepository);
	}

}
