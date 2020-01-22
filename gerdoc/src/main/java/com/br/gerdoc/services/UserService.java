package com.br.gerdoc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.gerdoc.model.User;
import com.br.gerdoc.respository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository userRepo;
	
	public void insertUser(User obj) {
		userRepo.save(obj);
	}
	
	public User findById(int id) {
		Optional<User> obj = userRepo.findById(id);
		return obj.orElse(null);
	}
	
	public void updateUser(int id,User obj) {
		User newUser = findById(id);
		newUser.setEmail(obj.getEmail());
		newUser.setNome(obj.getNome());
		newUser.setPassword(obj.getPassword());
		userRepo.save(newUser);
	}
	
	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}
	
	public void login(String email, String senha) {
		
	}
	
	
}
