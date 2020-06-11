package com.juan.classpk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.classpk.dto.PersonaDto;
import com.juan.classpk.entity.Persona;
import com.juan.classpk.entity.PersonaPk;
import com.juan.classpk.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	@GetMapping
	public ResponseEntity<?> getAllPersona() {
		List<Persona> persona = new ArrayList<>();
		persona = personaService.findAll();
		if (persona.isEmpty()) {
			return new ResponseEntity<List<Persona>>(HttpStatus.NO_CONTENT);

		}
		return new ResponseEntity<List<Persona>>(persona, HttpStatus.OK);

	}

	/*
	 * Creo el metodo post para estraer la personaPk que me interesa ya que con un
	 * get tendriamos que pasar dos id de la misma clase
	 * 
	 */

	@PostMapping("/getId")
	public ResponseEntity<?> getByIdPersona(@RequestBody PersonaPk personaPk) {
		Persona persona1 = personaService.findByIdPersona(personaPk);
		return new ResponseEntity<Persona>(persona1, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<?> createPersona(@RequestBody Persona persona) {
		Persona persona1 = personaService.createPersona(persona);
		return ResponseEntity.status(HttpStatus.CREATED).body(persona1);
	}

	@PutMapping("{nombre}")
	public ResponseEntity<?> updatePersona(@RequestBody PersonaDto personaDto, @PathVariable String nombre) {
		Persona personaTransformar = new Persona(personaDto);
		Persona persona1 = personaService.findByIdPersona(personaTransformar.getId());
		persona1.setNombre(nombre);
		personaService.update(persona1);
		return new ResponseEntity<Persona>(persona1, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{nombre}")
	public ResponseEntity<?> deletePersona(@RequestBody PersonaDto personaDto, @PathVariable String nombre) {
		Persona personaTransformar = new Persona(personaDto);
		Persona persona1 = personaService.findByIdPersona(personaTransformar.getId());
		persona1.setNombre(nombre);
		personaService.delete(persona1);
		return new ResponseEntity<Persona>(persona1, HttpStatus.OK);
	}

}
