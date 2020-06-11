package com.juan.classpk.service;

import java.util.List;

import com.juan.classpk.entity.Persona;
import com.juan.classpk.entity.PersonaPk;

public interface PersonaService {

	List<Persona> findAll();

	Persona createPersona(Persona persona);

	Persona findByIdPersona(PersonaPk personaPk);

	Persona update(Persona persona);

	void delete(Persona persona);

	Persona findByIdPersonaEntity(Persona persona);
}
