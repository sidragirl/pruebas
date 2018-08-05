package com.car.mundo.usuario.dao;

import com.car.mundo.usuario.dto.LoginDto;

public interface IUsuarioDAO {
	
	Integer login(LoginDto dto);

}
