package com.fr.adaming.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fr.adaming.entity.User;

@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	private UserService service;
	
	@Test 
	public void createValidUser_shouldReturnUserWithIdNotNull() {
		//prepare les inputs
		User u = new User();
		u.setNom("nomA");
		u.setEmail("email@email.fr");
		u.setPwd("azerty");
		
		//invoque la methode
		
		//verifier le resultat
	}
	
	

}
