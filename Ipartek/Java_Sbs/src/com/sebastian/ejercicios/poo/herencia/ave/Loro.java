package com.sebastian.ejercicios.poo.herencia.ave;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class Loro extends Ave {

	private char region;
	
	public Loro(char sexo, int edad) {
		super(sexo, edad);
	}

	public Loro(char sexo, int edad, char region) {
		super(sexo, edad);
		setRegion(region);
	}

	public char getRegion() {
		return region;
	}

	public void setRegion(char region) {
		this.region = region;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + region;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loro other = (Loro) obj;
		if (region != other.region)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Loro [getSexo()=" + getSexo() + ", getEdad()=" + getEdad() + ", getRegion()=" + getRegion() + "]";
	}
	
	public void deDondeEres() {
		switch (getRegion()) {
		case 'N':
			pl("Norte");
			break;
		case 'S':
			pl("Sur");
			break;
		case 'E':
			pl("Este");
			break;
		case 'O':
			pl("Oeste");
			break;
		}
	}
	
}
