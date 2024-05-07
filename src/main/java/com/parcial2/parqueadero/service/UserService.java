package com.parcial2.parqueadero.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parcial2.parqueadero.model.UserModel;

import cechdi.Backendlogin.User.User;
import cechdi.Backendlogin.User.UserRepository;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getTodosByUserName(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	@Override
	public Optional<UserModel> getTodoById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public void updateTodo(UserModel userModel) {
		userRepository.save(userModel);
		
	}

	@Override
	public void addTodo(String username, boolean isDone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTodo(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTodo(UserModel userModel) {
		// TODO Auto-generated method stub
		
	}
	


}
