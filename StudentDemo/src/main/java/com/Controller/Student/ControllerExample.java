package com.Controller.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Service.Student.ServiceExample;

@RestController
@RequestMapping("api/v1/user")
public class ControllerExample {

@Autowired	
private ServiceExample serviceExample;

@GetMapping("/users")
public String greet() {
	return serviceExample.greetUser();
}
}
