package com.fr.adaming.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fr.adaming.controller.dto.RegisterDto;
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
		User returnedUser = service.save(u);
		
		//verifier le resultat
		assertNotNull(returnedUser);
		//assertNotNull(returnedUser.getId());
		assertNotNull(returnedUser.getNom());
		assertNotNull(returnedUser.getPwd());
		assertTrue(u.getNom().equals(returnedUser.getNom()));
		
	}
	
//	
//	@Rule
//	public ExpectedException exception;
//	
//	
//	
//	@Test
//	public void testWithJunit() {
//		// Preparer les inputs
//		int x = 5;
//		int y = 11;
//		
//		//invoquer la methode 
//		int z = somme(x, y);
//		
//		//verifier le resultat
//		assertTrue(z == 16);
//		
//	}
//	
//	
//	@Test
//	public void convert5ToString_shouldReturnString5() {
//		assertTrue(convert(5).equals("5"));
//		
//	}
//	
////	@Test
////	public void convertNotIntegerToString_shouldThrowNumberFormatException() {
////		convert(new Integer("shjdfjk"));
////		exception.expect(NumberFormatException.class);
////		exception.expectMessage("For input string:\"shjdfjk\"");
////	}
//	
//	@Test
//	public void testUserConstructeur() {
//		RegisterDto dto = new RegisterDto();
//		dto.setNom("x");
//		dto.setEmail("y");
//		
//		User user = new User(dto);
//		
//		assertTrue(user.getNom().equals(dto.getNom()));
//		assertTrue(user.getEmail().equals(dto.getEmail()));
//	}
//	
//	
//	public int somme(int x, int y) {
//		return x+y;
//	}
//	
//	
//	public String convert(int x) {
//		return new Integer(x).toString();
//	}

}
