package com.car.mundo.personaje.service;

import java.util.List;

import com.car.mundo.personaje.domain.Personaje;

public interface IPersonajeService {
	
	List<Personaje> listarPersonajesUsuario(String usuario);

}
