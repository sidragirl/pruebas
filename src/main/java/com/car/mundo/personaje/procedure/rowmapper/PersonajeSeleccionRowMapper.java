package com.car.mundo.personaje.procedure.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.car.mundo.personaje.domain.Personaje;
import com.car.mundo.personaje.domain.SexoEnum;

public class PersonajeSeleccionRowMapper implements RowMapper<Personaje>{

	@Override
	public Personaje mapRow(ResultSet rs, int rowNum) throws SQLException {
		Personaje resultado = new Personaje();
		resultado.setIdPersonaje(rs.getLong("ID"));
		resultado.setNombre(rs.getString("NOMBRE"));
		resultado.setApellido(rs.getString("APELLIDO"));
		resultado.setEdad(rs.getInt("EDAD"));
		String sexoStr = rs.getString("SEXO");
		SexoEnum sexo = null;
		if (SexoEnum.HOMBRE.getSimbolo().equals(sexoStr)) {
			sexo = SexoEnum.HOMBRE;
		} else if (SexoEnum.MUJER.getSimbolo().equals(sexoStr)) {
			sexo = SexoEnum.MUJER;
		}
		resultado.setSexo(sexo);
		resultado.setUltimoCumpleanios(rs.getDate("F_ULTIMO_CUMPLE"));
		resultado.setUrlImagen(rs.getString("URL_IMAGEN"));
		return resultado;
	}

}
