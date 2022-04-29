package com.utilityserviceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.utilityserviceapp.model.User;
import com.utilityserviceapp.repository.UserRepository;
@RestController
public class UserDetailsController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("users/save")
	public String save(@RequestBody User user) {
		String result=null;
		try{
			userRepository.save(user);
			result="success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result="failed";
		}
		finally
		{
			System.out.println("finish");
		}
		return result;
	}
	
	@GetMapping("users/list")
	public List<User> findAll() {
		List<User> userList = userRepository.findAll();
		return userList;
	}
	
	//@DeleteMapping("users/{id}")
	//public void delete(@pathVariable("id)") Integer id) {
		//userRepository.deleteById
	//}

}
