package com.parcial2.parqueadero.service;


import java.util.Optional;

import com.parcial2.parqueadero.model.UserModel;

import cechdi.Backendlogin.User.User;

public interface IUserService {
	
	Optional<User> getTodosByUserName(String username);

	Optional<UserModel> getTodoById(long id);

	void updateTodo(UserModel userModel);

	void addTodo(String username, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(UserModel userModel);
}
