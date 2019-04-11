package com.car.mundo.personaje.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.car.mundo.personaje.dao.IPersonajeDAO;
import com.car.mundo.personaje.domain.Personaje;
import com.car.mundo.personaje.procedure.ListarPersonajesUsuarioProcedure;

@Repository
public class PersonajeDAO implements IPersonajeDAO {
	
	@Autowired
	ListarPersonajesUsuarioProcedure listarPersonajesUsuarioProcedure;

	@Override
	public List<Personaje> listarPersonajesUsuario(String usuario) {
		return listarPersonajesUsuarioProcedure.execute(usuario);
	}

}
