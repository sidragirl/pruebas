package com.car.mundo.usuario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.mundo.usuario.dao.impl.UsuarioDAO;
import com.car.mundo.usuario.dto.LoginDto;
import com.car.mundo.usuario.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {
	
	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public Integer login(LoginDto dto) {
		return usuarioDAO.login(dto);
	}

}
