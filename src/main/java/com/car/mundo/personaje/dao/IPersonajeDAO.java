package com.car.mundo.personaje.dao;

import java.util.List;

import com.car.mundo.personaje.domain.Personaje;

public interface IPersonajeDAO {
	
	List<Personaje> listarPersonajesUsuario(String usuario);

}
