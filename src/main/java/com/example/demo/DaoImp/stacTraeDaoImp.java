package com.example.demo.DaoImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.example.demo.DAO.stacTraeDao;
import com.example.demo.SQL.stacTraeSQL;
import com.example.demo.modelo.estac_trae;



public class stacTraeDaoImp extends JdbcDaoSupport implements stacTraeDao{

	private String sqlTot = "";
	@Override
	public <S extends estac_trae> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends estac_trae> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<estac_trae> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<estac_trae> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<estac_trae> findAllById(Iterable<Long> ids) {
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
	public void delete(estac_trae entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends estac_trae> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<estac_trae> getWSEnUso(){
		List<estac_trae> list = new ArrayList<>();
		sqlTot = stacTraeSQL.SELECT_WS_EN_USO.toString();
		estac_trae etAuxiliar;
		
		SqlRowSet rs = this.getJdbcTemplate().queryForRowSet(sqlTot, new Object[] {});
		while(rs.next()) {
			etAuxiliar = new estac_trae();
			etAuxiliar.setFcWSDesc(rs.getString(0));
			etAuxiliar.setFcNombreCorto(rs.getString(1));
			etAuxiliar.setFdFecInstall(rs.getString(2));
			etAuxiliar.setFcEmpNo(rs.getInt(3));
			etAuxiliar.setFiWSStatus(rs.getShort(4));
			list.add(etAuxiliar);
		}
		return list;
	}

}
