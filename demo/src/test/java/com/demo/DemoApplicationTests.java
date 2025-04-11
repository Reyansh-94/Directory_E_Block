package com.demo;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Registration;
import com.demo.repository.RegistrationRepository;

@SpringBootTest
class DemoApplicationTests {
@Autowired	
private RegistrationRepository registrationRepository;

@Test
void saveRegistration() {
	Registration r = new Registration();
	r.setName("Sony pal");
	r.setEmail("sony4563@gmail.com");
	r.setMobile("6346275835");
	registrationRepository.save(r);
}

@Test
void deleteRegistration() {
	registrationRepository.deleteById(2L);
}

@Test
void getRegistration() {
	Optional<Registration> val = registrationRepository.findById(2L);
	if(val.isPresent()) {
		Registration registration = val.get();
		System.out.println(registration.getId());
		System.out.println(registration.getName());
		System.out.println(registration.getEmail());
		System.out.println(registration.getMobile());
		}else {
			System.out.println("No record Found....");
		}
}

@Test
void getRegistrationAll() {
	Iterable<Registration> allVal = registrationRepository.findAll();
	for(Registration val: allVal) {
		System.out.println(val.getId());
		System.out.println(val.getName());
		System.out.println(val.getEmail());
		System.out.println(val.getMobile());
	}
}

@Test
void getRegistratioinByEmail() {
	Optional<Registration> iter = registrationRepository.findByEmail("psm4563@gmail.com");
if(iter.isPresent()) {
	Registration val = iter.get();
	System.out.println(val.getId());
	System.out.println(val.getName());
	System.out.println(val.getEmail());
	System.out.println(val.getMobile());
}else {
	System.out.println("No record Found!");
}
}

@Test
void getRegistrationByMoblie() {

	Optional<Registration> iter = registrationRepository.findByMobile("6346275835");
if(iter.isPresent()) {
	Registration val = iter.get();
	System.out.println(val.getId());
	System.out.println(val.getName());
	System.out.println(val.getEmail());
	System.out.println(val.getMobile());
}else {
	System.out.println("No record Found!");
}
}

@Test
void getRegistrationByEmailOrMobile() {
	Iterable<Registration> allVal = registrationRepository.findByEmailOrMobile("psm4563@gmail.com", "6346275835");
	for(Registration val: allVal) {
		System.out.println(val.getId());
		System.out.println(val.getName());
		System.out.println(val.getEmail());
		System.out.println(val.getMobile());
	}
}

@Test
void getRegistrationByEmailAndMoblie() {

	Optional<Registration> iter = registrationRepository.findByEmailAndMobile("psm4563@gmail.com", "6346275835");
if(iter.isPresent()) {
	Registration val = iter.get();
	System.out.println(val.getId());
	System.out.println(val.getName());
	System.out.println(val.getEmail());
	System.out.println(val.getMobile());
}else {
	System.out.println("No record Found!");
}
}


//use of jpql annotation method
@Test
void getRegistratioinByEmployeeEmail() {
	Registration val = registrationRepository. findByEmployeeEmail("psm4563@gmail.com");
	
	System.out.println(val.getId());
	System.out.println(val.getName());
	System.out.println(val.getEmail());
	System.out.println(val.getMobile());
}

@Test
void getRegistratioinByEmployeeMobile() {
	Registration val = registrationRepository. findByEmployeeMobile("8449988719");
	if(val != null) {
	System.out.println(val.getId());
	System.out.println(val.getName());
	System.out.println(val.getEmail());
	System.out.println(val.getMobile());
	}else {
		System.out.println("No Found Data");
	}

}

@Test
void getRegistrationByEmpEmailOrMobile() {
	List<Registration> valAll = registrationRepository.findByEmployeeEmailOrMobile("psm4563@gmail.com", "6346275835");
	
	for(Registration val:valAll) {
		System.out.println(val.getId());
		System.out.println(val.getName());
		System.out.println(val.getEmail());
		System.out.println(val.getMobile());
	}
}


@Test
void getRegistrationByEmpEmailAndMoblie() {
	Registration val = registrationRepository.findByEmployeeEmailAndMobile("psm4563@gmail.com", "8449988719");
	if(val != null) {
		System.out.println(val.getId());
	System.out.println(val.getName());
	System.out.println(val.getEmail());
	System.out.println(val.getMobile());
	}else {
		System.out.println("No data Found");
	}
	
}


}

