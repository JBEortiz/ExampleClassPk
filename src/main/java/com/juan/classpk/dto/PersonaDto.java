package com.juan.classpk.dto;

/*
 * Hacemos esta clase como filtro de lo que queremos mostrar
 */
public class PersonaDto {

	private Long idDni;
	private Long idSeguridadSocial;
	private String nombre;
	private String apellido;
	private int edad;

	public Long getIdDni() {
		return idDni;
	}

	public void setIdDni(Long idDni) {
		this.idDni = idDni;
	}

	public Long getIdSeguridadSocial() {
		return idSeguridadSocial;
	}

	public void setIdSeguridadSocial(Long idSeguridadSocial) {
		this.idSeguridadSocial = idSeguridadSocial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
