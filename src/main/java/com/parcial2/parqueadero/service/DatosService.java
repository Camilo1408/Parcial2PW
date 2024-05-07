package com.parcial2.parqueadero.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parcial2.parqueadero.model.DatosModel;
import com.parcial2.parqueadero.repository.DatosRepository;

@Service
public class DatosService implements IDatosService{
	
	@Autowired
	private DatosRepository datosRepository;
	
	@Override
	public List<DatosModel> getTodosByPlaca(String placa) {
		return datosRepository.findByPlaca(placa);
	}

	@Override
	public Optional<DatosModel> getTodoById(long id) {
		return datosRepository.findById(id);
	}

	@Override
	public void updateTodo(DatosModel datosModel) {
		datosRepository.save(datosModel);
	}

	@Override
	public void addTodo(String placa, Date horaEntrada, Date horaSalida, boolean isDone) {
		datosRepository.save(new DatosModel());
		
	}

	@Override
	public void deleteTodo(long id) {
		Optional<DatosModel> datosModel = datosRepository.findById(id);
		if (datosModel.isPresent()) {
			datosRepository.delete(datosRepository.get());
		}
		
	}

	@Override
	public void saveTodo(DatosModel datosModel) {
		datosRepository.save(datosModel);
	}

}
