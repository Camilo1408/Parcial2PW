package com.parcial2.parqueadero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parcial2.parqueadero.model.DatosModel;


public interface DatosRepository extends JpaRepository<DatosModel, Long>{
	List<DatosModel> findByPlaca(String placa);

	DatosModel get();


}
