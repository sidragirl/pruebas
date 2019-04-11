package com.car.mundo.personaje.domain;

public enum SexoEnum {
	
	HOMBRE("M"),
	MUJER("F");
	
	private String simbolo;

	private SexoEnum(String simbolo) {
		this.simbolo = simbolo;
	}

	/**
	 * @return the simbolo
	 */
	public String getSimbolo() {
		return simbolo;
	}

}
