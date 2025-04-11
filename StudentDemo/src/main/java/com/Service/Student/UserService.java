package com.Service.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Student.User;
import com.Repository.Student.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<org.apache.catalina.User> getAllUserData() {
		return userRepository.findAll();
   }
	
	public User createUser(User user) {
	   return userRepository.save(user);
	}
}