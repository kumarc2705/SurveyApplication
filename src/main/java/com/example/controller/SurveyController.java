package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.User;
import com.example.service.UserService;

@Controller

public class SurveyController {
	
	@Autowired
	 private UserService userService;

@RequestMapping("/")
public String showHomePage(){
	return "home";
}
@PostMapping("/signUp")
public String showSignUp(@RequestParam("name") String name, @RequestParam("password") String password,
		@RequestParam("company") String company,ModelMap map ){
	User user=new User();
	user.setName(name);
	user.setPassword(password);
	user.setCompany(company);
	map.addAttribute("message","Signup Successful");
    userService.addUser(user);
	
 return "home";	
}

@PostMapping("/login")
public String  showLogin(@RequestParam("name") String name,@RequestParam("password") String password,ModelMap map){
	User user=userService.getUserByName(name);
	if(user==null){
		map.addAttribute("message", "invalid user");
		return "home";
	}
	else{
		if(password.equals(user.getPassword())){
			
			return "loggedin";
			
		}
		else{
			map.addAttribute("message", "invalid password");
			return "home";
		}
	}
	
	
}











}
