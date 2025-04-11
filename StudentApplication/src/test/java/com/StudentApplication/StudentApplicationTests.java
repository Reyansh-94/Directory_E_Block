package com.StudentApplication;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.StudentRegistration.Entity.RegistrationForm;
import com.StudentRegistration.Repository.RegistrationFormRepository;

@SpringBootTest
class StudentApplicationTests {
	@Autowired
	private RegistrationFormRepository registrationFormRepository;
	
	@Test
	void saveRegistration() {		
	RegistrationForm reg = new RegistrationForm();
	reg.setName("mike");
	reg.setEmail("mike@gmail.com");
	reg.setMobile("9368277694");
	reg.setName("mike1");
	reg.setEmail("mike1@gmail.com");
	reg.setMobile("9368277695");
	RegistrationForm saved = registrationFormRepository.save(reg);
	System.out.println("Student Data saved successfully..."+saved);
}
	
	@Test
	void deleteRegistration() {
	    registrationFormRepository.deleteById(1L);
	    System.out.println("Delete the data from database successfully...");
	}
	
	@Test
	void findByMobileRegistration() {
		Optional<RegistrationForm> datas = registrationFormRepository.findByMobile("9368277694");
		if(datas.isPresent()) {
			RegistrationForm data = new RegistrationForm();
			System.out.println(data.getId());
			System.out.println(data.getName());
			System.out.println(data.getMobile());
			System.out.println(data.getEmail());
		}
		else  {
			System.out.println("No data found...");
		}
	}
		@Test
		void findByEmailRegistration() {
			Optional<RegistrationForm> datas = registrationFormRepository.findByEmail("mike@gmail.com");
			if(datas.isPresent()) {
				RegistrationForm data = new RegistrationForm();
				System.out.println(data.getId());
				System.out.println(data.getName());
				System.out.println(data.getMobile());
				System.out.println(data.getEmail());
			}else  {
				System.out.println("No data found...");
			}
		}		
			@Test
			void findByEmailOrMobileRegistration() {
				Iterable<RegistrationForm> datas = registrationFormRepository.findByEmailOrMobile("mike@gmail.com", "9368277694");
				for(RegistrationForm data: datas) {
					System.out.println(data.getId());
					System.out.println(data.getName());
					System.out.println(data.getMobile());
					System.out.println(data.getEmail());
				}
			}		
				@Test
				void findByEmailAndMobileRegistration() {
					Optional<RegistrationForm> datas = registrationFormRepository.findByEmailAndMobile("mike@gmail.com", "9368277694");
					if(datas.isPresent()) {
						RegistrationForm data = new RegistrationForm();
						System.out.println(data.getId());
						System.out.println(data.getName());
						System.out.println(data.getMobile());
						System.out.println(data.getEmail());
					}else  {
						System.out.println("No data found...");
					}
				}
				//Jpql Query
				
				@Test
				void getByEmailRegistration() {
					RegistrationForm valAll = registrationFormRepository.findByEmployeeEmail("mike@gmail.com");
					if(valAll != null) {
						System.out.print(valAll.getId());
						System.out.print(valAll.getEmail());
						System.out.print(valAll.getMobile());
						System.out.print(valAll.getName());
						}else {
							System.out.print("Data not Found");
						}
				}
				
				@Test
				void getByMobileRegistration() {
					RegistrationForm valAll = registrationFormRepository.findByEmployeeMobile("9368277694");
					if(valAll != null) {
						System.out.print(valAll.getId());
						System.out.print(valAll.getEmail());
						System.out.print(valAll.getMobile());
						System.out.print(valAll.getName());
						}else {
							System.out.print("Data not Found");
						}
				}
				
				@Test
				void getByEmailOrMobileRegistration() {
					List<RegistrationForm> valAlls = registrationFormRepository.findByEmployeeEmailOrMobile("mike@gmail.com", "9368277694");
					if(valAlls != null) {
						for(RegistrationForm valAll: valAlls) {
						System.out.print(valAll.getId());
						System.out.print(valAll.getEmail());
						System.out.print(valAll.getMobile());
						System.out.print(valAll.getName());
						}
					}else {
							System.out.print("Data not Found");
						}
				}
				
				@Test
				void getByEmailAndMobileRegistration() {
					RegistrationForm valAll = registrationFormRepository.findByEmployeeEmailAndMobile("mike@gmail.com", "9368277694");
					if(valAll != null) {
						System.out.print(valAll.getId());
						System.out.print(valAll.getEmail());
						System.out.print(valAll.getMobile());
						System.out.print(valAll.getName());
						}else {
							System.out.print("Data not Found");
						}
				}

}
				
				
				
				
				
				
				
				
				
				
				
				
				