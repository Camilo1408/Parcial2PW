package com.parcial2.parqueadero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parcial2.parqueadero.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Long>{
	List<UserModel> findByUserName(String username);
}
