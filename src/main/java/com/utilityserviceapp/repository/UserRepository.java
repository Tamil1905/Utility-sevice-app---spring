package com.utilityserviceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utilityserviceapp.model.User;

public interface UserRepository extends JpaRepository<User , Integer>{
	User save(User user);
}
