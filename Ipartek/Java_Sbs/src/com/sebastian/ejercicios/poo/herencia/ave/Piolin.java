package com.sebastian.ejercicios.poo.herencia.ave;

public class Piolin extends Canario {

	private int numeroDePeliculas;

	public Piolin(char sexo, int edad, int numeroDePeliculas) {
		super(sexo, edad);
		setNumeroDePeliculas(numeroDePeliculas);
	}

	public int getNumeroDePeliculas() {
		return numeroDePeliculas;
	}

	public void setNumeroDePeliculas(int numeroDePeliculas) {
		this.numeroDePeliculas = numeroDePeliculas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numeroDePeliculas;
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
		Piolin other = (Piolin) obj;
		if (numeroDePeliculas != other.numeroDePeliculas)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Piolin [getSexo()=" + getSexo() + ", getEdad()=" + getEdad() + ", getNumeroDePeliculas()="
				+ getNumeroDePeliculas() + "]";
	}
	
	public static void main(String[] args) {
		Piolin p = new Piolin('M', 4, 98);
		Loro l = new Loro('H', 7, 'O');
		
		p.altura();
		l.deDondeEres();
		p.setTamanho(16);
		p.altura();
		l.setRegion('E');
		p.getNumeroDeAvesCreadas();
	}

}
