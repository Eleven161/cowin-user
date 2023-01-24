package com.microservice.cowin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.cowin.entity.CowinUser;
import com.microservice.cowin.service.CowinUserService;

@RestController
@RequestMapping("/cowin-user")
public class CowinUserController {
	@Autowired
	private CowinUserService cowinUserService;
	
	@RequestMapping("/greet")
	public String greet() {
		return "hello";
	}
	@GetMapping
	public ResponseEntity<List<CowinUser>> getAllUsers(){
		
		List<CowinUser> users=cowinUserService.getUsers();
		return new ResponseEntity<>(users,HttpStatus.OK);
		
	}
	@GetMapping("/adhaar/{id}")
	public ResponseEntity<CowinUser> getUser(@PathVariable String id){
		
		//List<CowinUser> users=cowinUserService.getUsers();
		return  ResponseEntity.ok(cowinUserService.getSingleUser(id));
		
	}
	@GetMapping("/vaccine-center/{id}")
    public ResponseEntity<List<CowinUser>> getUsersByCenter(@PathVariable int id){
		
		return  ResponseEntity.ok(cowinUserService.getUsersByVaccineCenter(id));
		
	}	
	@PostMapping
	public ResponseEntity<CowinUser> addUser(@RequestBody CowinUser user){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cowinUserService.createUser(user));
		
	}

}
