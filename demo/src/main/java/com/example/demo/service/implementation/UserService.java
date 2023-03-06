package com.example.demo.service.implementation;

import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.entity.UserDto;

public interface UserService {
	User save(UserDto user);

	List<User> findAll();

	void delete(int id);

	User findOne(String username);

	User findById(int id);

	UserDto update(UserDto userDto);

}
