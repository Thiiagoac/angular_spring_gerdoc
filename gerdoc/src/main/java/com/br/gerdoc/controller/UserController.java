package com.br.gerdoc.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.gerdoc.model.User;
import com.br.gerdoc.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	public UserService userService;
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<User> findById(@PathVariable int id){
		User obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insertUser(@RequestBody User obj){
		userService.insertUser(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri(); 
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Void> updateUser(int id,User obj){
		userService.updateUser(id, obj);
		return ResponseEntity.ok().build();
		
	}
	
	@RequestMapping(value ="/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteUser(int id){
		userService.deleteUser(id);
		return ResponseEntity.noContent().build();
	}
 
	
}
