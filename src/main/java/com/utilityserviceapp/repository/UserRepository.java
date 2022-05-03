package com.utilityserviceapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.utilityserviceapp.model.User;


//@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//	@SuppressWarnings("unchecked")
//	User save(User user);
	
	//select * from users;
	//List<User> findAll();
	
	//select * from users where email = ? and password = ?
	//User findByEmailAndPassword(String email, String password);
	
	//Optional<User> findById(Integer id);
	
	
//	@Modifying
//	@Query("delete from User u where u.id=:id")
//	void deleteById(@Param("id") Integer id);
//	
//	@Transactional
//	@Modifying
//	@Query("update User u set u.password = :password where u.id=:id")
//	void changePassword(@Param("id") Integer id, @Param("password") String password);
//	
	
}