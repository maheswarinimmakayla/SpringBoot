package com.mouritech.springbootthymeleafsecurityexample.service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.mouritech.springbootthymeleafsecurityexample.controller.dto.UserRegistrationDto;
import com.mouritech.springbootthymeleafsecurityexample.entity.User;
public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);

}
