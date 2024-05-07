package com.parcial2.parqueadero.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.parcial2.parqueadero.model.DatosModel;

public interface IDatosService {
	List<DatosModel> getTodosByPlaca(String placa);

	Optional<DatosModel> getTodoById(long id);

	void updateTodo(DatosModel datosModel);

	void addTodo(String placa, Date horaEntrada, Date horaSalida, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(DatosModel datosModel);

}
