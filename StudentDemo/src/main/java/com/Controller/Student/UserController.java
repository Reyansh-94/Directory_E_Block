package com.Controller.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Student.User;
import com.Service.Student.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/getUserData")
	public List<org.apache.catalina.User> getAllUsers() {
		return userService.getAllUserData();
	}
	
	@PostMapping("/createUser")
	public User createUser(User user) {
		return userService.createUser(user);
	}
}