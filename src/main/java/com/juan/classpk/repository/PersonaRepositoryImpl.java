package com.juan.classpk.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.juan.classpk.entity.Persona;
import com.juan.classpk.entity.PersonaPk;

@Repository
public class PersonaRepositoryImpl implements PersonaRepository {
	/*
	 * Constante con el metodo findAll
	 */
	// public static final String PERSONA_FIND_ALL = "findAll";

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@SuppressWarnings("unchecked")
	public List<Persona> findAll() {
		// return entityManager.createQuery(PERSONA_FIND_ALL).getResultList();
		return entityManager.createQuery("from Persona").getResultList();
	}

	@Override
	public Persona createPersona(Persona persona) {
		entityManager.persist(persona);
		return persona;
	}

	@Override
	public Persona findByIdPersona(PersonaPk personaPk) {
		return entityManager.find(Persona.class, personaPk);
	}

	@Override
	public Persona update(Persona persona) {
		return entityManager.merge(persona);
	}

	@Override
	public void delete(Persona persona) {
		entityManager.remove(persona);
	}

	@Override
	public Persona findByIdPersonaEntity(Persona persona) {
		return entityManager.find(Persona.class, persona);
	}

}
