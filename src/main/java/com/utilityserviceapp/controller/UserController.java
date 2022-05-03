package com.utilityserviceapp.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.utilityserviceapp.model.User;
import com.utilityserviceapp.repository.UserRepository;


@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@PostMapping("users/register")
	public void user(@RequestBody User user) {
		userRepository.save(user);
	}
	
	
	
//   @GetMapping("users/login")
//	public User login(
//			@RequestParam("email") String email,
//			@RequestParam("password") String password) {
//		User user = userRepository.findByEmailAndPassword(email, password);
//		if(user == null) {
//			//throw new Exception("Invalid Login Credentials");
//		}
//		return user;
//	
//	}
//	
//	@GetMapping("users/list")
//	public List<User> getAllUsers() {
//		List<User> userList = userRepository.findAll();
//		return userList;
//	}
//	
//	@GetMapping("users/delete/{id}")
//	public void delete(@PathVariable("id") Integer id) {
//		userRepository.deleteById(id);		 
//	}
//	
//	@GetMapping("users/change-password/{id}")
//	public void changePassword(@PathVariable("id") Integer id, @RequestParam("password") String password) {
//		userRepository.changePassword(id, password);
//	}
//
	
}