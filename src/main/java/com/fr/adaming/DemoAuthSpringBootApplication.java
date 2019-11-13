package com.fr.adaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fr.adaming.service.UserService;

@SpringBootApplication
public class DemoAuthSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoAuthSpringBootApplication.class, args);
		
		UserService service = (UserService) context.getBean("userService");
		
		service.faireUnTruc();
		
//		System.out.println("********FIND ALL************");
//		System.out.println(service.getAll());
//		
//		System.out.println("*********FIND BY ID************");
//		System.out.println(service.getById(2));
//		
//		System.out.println("********FIND BY EMAIL*************");
//		System.out.println(service.getByEmail("admin@adaming.fr"));
//		
//		System.out.println("********FIND BY EMAIL AND PWD*************");
//		System.out.println(service.login("admin@adaming.fr", "azerty"));
		
		System.out.println("********ACTIVATE ADMINS*************");
		service.activateAdmins();
	}

}
