package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.estac_trae;

public interface stacTraeDao extends CrudRepository<estac_trae, Long>{

	List<estac_trae> getWSEnUso();

}
