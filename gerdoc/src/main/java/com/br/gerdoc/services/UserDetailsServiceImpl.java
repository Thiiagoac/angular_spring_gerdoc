package com.br.gerdoc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.br.gerdoc.model.User;
import com.br.gerdoc.respository.UserRepository;
import com.br.gerdoc.security.UserSS;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User u = repo.findByEmail(email);
		if(u == null) {
			throw new UsernameNotFoundException(email);
			
		}
		return new UserSS(u.getId(),u.getEmail(),u.getPassword());
	}

}
