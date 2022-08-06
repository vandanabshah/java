package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entity.UserEntity;

public interface UserService {
	// create user
	public UserEntity createUser(UserEntity user) throws Exception;

	// get user by email
	public List getUser(String email) throws Exception;
}
