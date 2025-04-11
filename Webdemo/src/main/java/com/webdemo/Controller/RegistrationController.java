package com.webdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webdemo.Entity.Registration;
import com.webdemo.Service.EmailService;
import com.webdemo.Service.ServiceRepo;
import com.webdemo.dto.RegistrationDto;

@Controller
public class RegistrationController {
	
@Autowired
private ServiceRepo rs;

@Autowired
private EmailService emailService;

@RequestMapping("/viewReg")	
public String viewRegistrationPage() {
	return "registration";
}

@RequestMapping("/list-registrations")	
public String list_Registrations(Model model) {	
		List<Registration> reg = rs.listRegistrations();
        model.addAttribute("registrations", reg);
	return "list_registration";
}


//http://localhost:8030//viewReg

//@RequestMapping("/saveReg")
//public String saveRegistrationData(@ModelAttribute Registration registration, ModelMap model) {
//	rs.saveRegistration(registration);
//	model.addAttribute("msg", "record is saved!");
//	return "registration";
//}

//
//@RequestMapping("/saveReg")
//public String saveRegistrationData(
//    @RequestParam String name,
//    @RequestParam String emailId,
//    @RequestParam String mobile,
//		ModelMap model) {
//	
//	Registration registration = new Registration();
//	registration.setName(name);
//	registration.setEmailId(emailId);
//	registration.setMobile(mobile);
//	model.addAttribute("msg", "record is saved!");
//	return "registration";
//}


@RequestMapping("/saveReg")
public String saveRegistrationData(RegistrationDto dto, ModelMap model) {
	Registration registration = new Registration();
	
	registration.setName(dto.getName());
	registration.setEmailId(dto.getEmailId());
	registration.setMobile(dto.getMobile());
	rs.saveRegistration(registration);
	emailService.sendEmail(dto.getEmailId(), "Welcome", "test...");
	model.addAttribute("msg", "record is saved!");
	return "registration";
}

@RequestMapping("/updateReg")
public String updateRegistration(RegistrationDto dto, ModelMap model) {
	Registration registration = new Registration();
	
	registration.setId(dto.getId());
	registration.setName(dto.getName());
	registration.setEmailId(dto.getEmailId());
	registration.setMobile(dto.getMobile());
	rs.saveRegistration(registration);
	model.addAttribute("msg", "record is updated!");
	return "registration";
}

@RequestMapping("/deleteReg")
public String deleteRegistration(@RequestParam String emailId, Model model) {
	rs.deleteRegistration(emailId);
	
	List<Registration> reg = rs.listRegistrations();
    model.addAttribute("registrations", reg);
return "list_registration";
}

@RequestMapping("/getReg")
public String getRegistration(@RequestParam long id, Model model) {
	Registration registration = rs.getRegistration(id);
	
model.addAttribute("registration", registration);
return "updateReg";
}

}
