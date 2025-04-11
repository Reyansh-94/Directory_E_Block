package com.webdemo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.webdemo.Entity.Registration;
import com.webdemo.Repository.RegistrationRepository;

@Service
public class ServiceRepo {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	public void saveRegistration(Registration registration) {
		registrationRepository.save(registration);
	}

	public List<Registration> listRegistrations() {
		List<Registration> reg = registrationRepository.findAll();
		return reg;
	}

	public void deleteRegistration(String emailId) {
		registrationRepository.deleteByEmailId(emailId);		
	}

	public Registration getRegistration(long id) {
		Optional<Registration> regId = registrationRepository.findById(id);
		Registration registration = regId.get();
		return registration;
	}
}