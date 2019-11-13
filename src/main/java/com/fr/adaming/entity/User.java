package com.fr.adaming.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fr.adaming.controller.dto.LoginDto;
import com.fr.adaming.controller.dto.RegisterDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@NonNull
		private String nom;
		
		@Column(unique = true)
		private String email;
		
		private String pwd;
		
		private boolean activated;
		
		private String role;
		
		private LocalDate birthDate;
		
		public User (RegisterDto dto) {
			this.nom = dto.getNom();
			this.email = dto.getEmail();
			this.pwd = dto.getPwd();
			this.birthDate = dto.getBirthDate();
		}
		
		public User(LoginDto dto) {
			this.email = dto.getEmail();
			this.pwd = dto.getPwd();
		}
		

}
