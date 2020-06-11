package com.juan.classpk.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
/*
 * Clase con las claves primarias
 */

@Embeddable
public class PersonaPk implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idDni;
	private Long idSeguridadSocial;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDni == null) ? 0 : idDni.hashCode());
		result = prime * result + ((idSeguridadSocial == null) ? 0 : idSeguridadSocial.hashCode());
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
		PersonaPk other = (PersonaPk) obj;
		if (idDni == null) {
			if (other.idDni != null)
				return false;
		} else if (!idDni.equals(other.idDni))
			return false;
		if (idSeguridadSocial == null) {
			if (other.idSeguridadSocial != null)
				return false;
		} else if (!idSeguridadSocial.equals(other.idSeguridadSocial))
			return false;
		return true;
	}

}
