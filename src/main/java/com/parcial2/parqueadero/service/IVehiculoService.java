package com.parcial2.parqueadero.service;

import java.util.List;
import java.util.Optional;

import com.parcial2.parqueadero.model.VehiculoModel;


public interface IVehiculoService {
	List<VehiculoModel> getTodosByTipo(String tipo);

	Optional<VehiculoModel> getTodoById(long id);

	void updateTodo(VehiculoModel vehiculoModel);

	void addTodo(String tipo, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(VehiculoModel vehiculoModel);

}
