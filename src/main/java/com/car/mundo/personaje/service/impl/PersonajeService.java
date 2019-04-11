package com.car.mundo.personaje.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.mundo.personaje.dao.impl.PersonajeDAO;
import com.car.mundo.personaje.domain.Personaje;
import com.car.mundo.personaje.service.IPersonajeService;

@Service
public class PersonajeService implements IPersonajeService {
	
	@Autowired
	private PersonajeDAO personajeDAO;

	@Override
	public List<Personaje> listarPersonajesUsuario(String usuario) {
		return personajeDAO.listarPersonajesUsuario(usuario);
	}

}
