package com.example.services;

import com.example.models.UserEntity;

public interface UserService {
	
	Object getAllUsers() throws Exception;
		
	Object saveUserDetails(UserEntity userEntity) throws Exception;
}
