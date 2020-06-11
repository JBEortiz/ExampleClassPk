package com.juan.classpk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juan.classpk.entity.Persona;
import com.juan.classpk.entity.PersonaPk;
import com.juan.classpk.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

	@Override
	@Transactional
	public Persona createPersona(Persona persona) {
		return personaRepository.createPersona(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findByIdPersona(PersonaPk personaPk) {
		return personaRepository.findByIdPersona(personaPk);
	}

	@Override
	@Transactional
	public Persona update(Persona persona) {
		return personaRepository.update(persona);
	}

	@Override
	@Transactional
	public void delete(Persona persona) {
		personaRepository.delete(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findByIdPersonaEntity(Persona persona) {
		return personaRepository.findByIdPersonaEntity(persona);
	}

}
