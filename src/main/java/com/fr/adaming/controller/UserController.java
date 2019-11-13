package com.fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.controller.dto.LoginDto;
import com.fr.adaming.controller.dto.RegisterDto;
import com.fr.adaming.entity.User;
import com.fr.adaming.service.UserService;

@RestController
@RequestMapping(path = "api/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping(path = "/get-all")
	public List<User> getAllUsers(){
		System.out.println("************************ Ca A Marche ************************");
		return service.getAll();
	}
	
	
	@GetMapping(path = "/get-id/{idx}")
	public User getOneByI(@PathVariable(name = "idx") int id) {
		return service.getById(id);
	}
	
	
	@RequestMapping(path = "/create", method = RequestMethod.POST )
	public String create(@RequestBody User user) {
		if(service.save(user) != null) {
			return "SUCCESS";
		}else {
			return "FAIL";
		}
	}
	
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login (@RequestBody LoginDto loginDto) {
		if(service.login(loginDto.getEmail(), loginDto.getPwd()) != null) {
			return "SUCCESS";
		}else {
			return "FAIL";
		}
		
	}
	
	
	@PostMapping(path = "/register")
	public String register(@RequestBody RegisterDto dto) {
		User user = new User();
		user.setEmail(dto.getEmail());
		user.setPwd(dto.getPwd());
		user.setNom(dto.getNom());
		
		if(service.save( new User(dto)) != null) {
			return "SUCCESS";
		}else {
			return "FAIL";
		}
	}
	
	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteById(@PathVariable int id) {
		service.deleteById(id);
		return "Object deleted";
	}
	
	

}
