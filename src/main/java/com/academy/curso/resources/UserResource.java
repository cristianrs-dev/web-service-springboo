package com.academy.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academy.curso.entities.User;


@RestController
@RequestMapping(value="/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1,"maria","maria@gmail.com","9999-999","123");
		return ResponseEntity.ok().body(u);
	}
}
