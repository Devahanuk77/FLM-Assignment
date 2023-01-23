package com.flm.jfs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flm.jfs.dto.UserDTO;
import com.flm.jfs.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	
	@PostMapping("/create-user")
	public String createUser(@RequestBody UserDTO userDTO) {
		System.out.println("Student object saved successfully!!");
		userService.createUser(userDTO);
		return "User inserted successfully !";
		
	}
	@GetMapping("/get-user/{id}")
	public UserDTO getUser(@PathVariable int id) {
		System.out.println("Studnet service invoked!!!"+id);
		return userService.getUser(id);
		
		
		
	}
	@PutMapping("/update-user")
	public String updateUser(@RequestBody UserDTO userDTO) {
		System.out.println("Userservice Invoked !!");
		userService.createUser(userDTO);
		return "User details updated successfully !";
		
	}
	
	
	

}
