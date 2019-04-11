package com.car.mundo.personaje.domain;

import java.io.Serializable;
import java.util.Date;

public class Personaje implements Serializable{

	private static final long serialVersionUID = 8424406419127481574L;
	
	private Long idPersonaje;
	private String nombre;
	private String apellido;
	private SexoEnum sexo;
	private Integer edad;
	private Date ultimoCumpleanios;
	private String urlImagen;

	/**
	 * @return the idPersonaje
	 */
	public Long getIdPersonaje() {
		return idPersonaje;
	}

	/**
	 * @param idPersonaje the idPersonaje to set
	 */
	public void setIdPersonaje(Long idPersonaje) {
		this.idPersonaje = idPersonaje;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the sexo
	 */
	public SexoEnum getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	/**
	 * @return the ultimoCumpleanios
	 */
	public Date getUltimoCumpleanios() {
		return ultimoCumpleanios;
	}

	/**
	 * @param ultimoCumpleanios the ultimoCumpleanios to set
	 */
	public void setUltimoCumpleanios(Date ultimoCumpleanios) {
		this.ultimoCumpleanios = ultimoCumpleanios;
	}

	/**
	 * @return the urlImagen
	 */
	public String getUrlImagen() {
		return urlImagen;
	}

	/**
	 * @param urlImagen the urlImagen to set
	 */
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

}
