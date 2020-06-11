package com.juan.classpk.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.juan.classpk.dto.PersonaDto;

/*
 * Añadimos la query en la entidad 
 * para tener lo mas controlado
 */

@Entity
@Table(name = "persona")
//@NamedQuery(name = PersonaRepositoryImpl.PERSONA_FIND_ALL, query = "from Persona")
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @EmbeddedId con esta anotacion decimos que hay otra clase pk que contiene dos
	 *             claves primaria(clave primaria compuesta)
	 */

	@EmbeddedId
	private PersonaPk id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "edad")
	private int edad;

	public Persona(PersonaDto personaDto) {

		PersonaPk personaPk = new PersonaPk();
		personaPk.setIdDni(personaDto.getIdDni());
		personaPk.setIdSeguridadSocial(personaDto.getIdSeguridadSocial());
		this.id = personaPk;
		this.nombre = personaDto.getNombre();
		this.apellido = personaDto.getApellido();
		this.edad = personaDto.getEdad();
	}

	public Persona() {
		super();
	}

	public PersonaPk getId() {
		return id;
	}

	public void setId(PersonaPk id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
