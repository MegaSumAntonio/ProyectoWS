package com.example.demo.DaoImp;

import java.util.Optional;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.example.demo.DAO.empleadoDao;
import com.example.demo.modelo.empleado;

public class empleadoDaoImp extends JdbcDaoSupport implements empleadoDao{

	@Override
	public <S extends empleado> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends empleado> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<empleado> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<empleado> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<empleado> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(empleado entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends empleado> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
