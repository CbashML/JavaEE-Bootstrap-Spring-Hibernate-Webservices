package com.sebastian.ejercicios.poo.herencia.ave;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class Ave {
	private char sexo;
	private int edad;
	
	private static int numeroDeAvesCreadas;
	
	public Ave(char sexo, int edad) {
		super();
		setSexo(sexo);
		setEdad(edad);
		numeroDeAvesCreadas++;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
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
		result = prime * result + edad;
		result = prime * result + sexo;
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
		Ave other = (Ave) obj;
		if (edad != other.edad)
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ave [sexo=" + sexo + ", edad=" + edad + "]";
	}
	
	public int getNumeroDeAvesCreadas() {
		return numeroDeAvesCreadas;
	}
	
	public void quienSoy() {
		pl(this.toString());
	}

}
