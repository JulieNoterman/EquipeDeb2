package com.fr.adaming.converters;

import java.util.List;

import com.fr.adaming.controller.dto.LoginDto;
import com.fr.adaming.controller.dto.RegisterDto;
import com.fr.adaming.entity.User;

public class UserConverter {

	
	public User convert(RegisterDto dto) {
		User user = new User();
		user.setNom(dto.getNom());
		
		return user;
	}
	
	public RegisterDto convert(User user) {
		return null;
	}
	
	
	public User convert(LoginDto dto) {
		return null;
	}
	
	
	public List<User> convert2(List<RegisterDto> dtos){
		return null;
		
	}
	
	public List<RegisterDto> convert(List<User> users){
		return null;
	}
	
}
