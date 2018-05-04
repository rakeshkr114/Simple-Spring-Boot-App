package com.mindtree.SpringBootApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.SpringBootApp.models.User;
import com.mindtree.SpringBootApp.repositories.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	@Autowired
	private UserRepository userRepository;

	//Get method to list all users 
	@GetMapping
	public Iterable<User> get(){
		return userRepository.findAll();
	}
	
	//Post method to save a user 
	@PostMapping
	@ResponseStatus(code=HttpStatus.OK)
	public void create(@RequestBody User user) {
		userRepository.save(user);
	}
}
