package com.juan.classpk.repository;

import java.util.List;

import com.juan.classpk.entity.Persona;
import com.juan.classpk.entity.PersonaPk;

public interface PersonaRepository {
	/*
	 * Implemento metodos CRUD básico Tambien lo puedo hacer con
	 * CrudRepository-hibernate o JpaRepository-Jpa
	 */

	List<Persona> findAll();

	Persona createPersona(Persona persona);

	Persona findByIdPersona(PersonaPk personaPk);

	Persona update(Persona persona);

	void delete(Persona persona);

	Persona findByIdPersonaEntity(Persona persona);
}
