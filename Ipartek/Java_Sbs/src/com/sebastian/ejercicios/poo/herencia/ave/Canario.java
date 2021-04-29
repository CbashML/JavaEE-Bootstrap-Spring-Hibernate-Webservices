package com.sebastian.ejercicios.poo.herencia.ave;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class Canario extends Ave {
	private float tamanho;
	
	public Canario(char sexo, int edad) {
		super(sexo, edad);
	}
	
	public Canario(char sexo, int edad, float tamanho) {
		super(sexo, edad);
		setTamanho(edad);
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(tamanho);
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
		Canario other = (Canario) obj;
		if (Float.floatToIntBits(tamanho) != Float.floatToIntBits(other.tamanho))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Canario [getSexo()=" + getSexo() + ", getEdad()=" + getEdad() + ", getTamanho()=" + getTamanho() + "]";
	}
	
	public void altura() {
		if (tamanho > 30)
			pl("Alto");
		else if (15 <= tamanho && tamanho <= 30)
			pl("Mediano");
		else if (1 <= tamanho && tamanho <= 15)
			pl("bajo");
	}

}
