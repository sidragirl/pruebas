package com.car.mundo.usuario.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.car.mundo.usuario.dao.IUsuarioDAO;
import com.car.mundo.usuario.dto.LoginDto;
import com.car.mundo.usuario.procedure.LoginProcedure;

@Repository
public class UsuarioDAO implements IUsuarioDAO {
	
	@Autowired
	LoginProcedure loginProcedure;

	@Override
	public Integer login(LoginDto dto) {
		return loginProcedure.execute(dto);
	}

}
