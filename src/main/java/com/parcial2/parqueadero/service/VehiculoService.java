package com.parcial2.parqueadero.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parcial2.parqueadero.model.VehiculoModel;
import com.parcial2.parqueadero.repository.VehiculoRepository;

@Service
public class VehiculoService implements IVehiculoService{
	
	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	@Override
	public List<VehiculoModel> getTodosByTipo(String tipo) {
		return vehiculoRepository.findByTipo(tipo);
	}

	@Override
	public Optional<VehiculoModel> getTodoById(long id) {
		return vehiculoRepository.findById(id);
	}

	@Override
	public void updateTodo(VehiculoModel vehiculoModel) {
		vehiculoRepository.save(vehiculoModel);
		
	}

	@Override
	public void addTodo(String tipo, boolean isDone) {
		vehiculoRepository.save(new VehiculoModel());
		
	}

	@Override
	public void deleteTodo(long id) {
		Optional<VehiculoModel> vehiculoModel = vehiculoRepository.findById(id);
		if (vehiculoModel.isPresent()) {
			vehiculoRepository.delete(vehiculoRepository.get());
		}
	}

	@Override
	public void saveTodo(VehiculoModel vehiculoModel) {
		vehiculoRepository.save(vehiculoModel);
		
	}
	
}
