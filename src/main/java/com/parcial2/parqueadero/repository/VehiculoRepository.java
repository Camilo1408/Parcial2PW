package com.parcial2.parqueadero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parcial2.parqueadero.model.VehiculoModel;

public interface VehiculoRepository extends JpaRepository<VehiculoModel, Long>{
	List<VehiculoModel> findByTipo(String tipo);

	VehiculoModel get();
}
