package com.blogapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.blogapp.entities.User;
import com.blogapp.exceptions.ResourceNotFoundExcetion;
import com.blogapp.repositories.UserRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		// loading user from database by username

		User user = this.userRepo.findByEmail(username)
				.orElseThrow(() -> new ResourceNotFoundExcetion("User", "email" + username, 0));

		return user;
	}

}
