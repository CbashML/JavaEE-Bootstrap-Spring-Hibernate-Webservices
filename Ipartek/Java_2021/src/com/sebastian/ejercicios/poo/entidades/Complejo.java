package com.sebastian.ejercicios.poo.entidades;

public class Complejo {

	private double real;
	private double imaginario;
	
	public Complejo() {
		setReal(0);
		setImag(0);
	}

	public Complejo(double real, double imaginario) {
		setReal(real);
		setImag(imaginario);
	}

	public double getReal() {
		return real;
	}

	public void setReal(double a) {
		this.real = a;
	}

	public double getImag() {
		return imaginario;
	}

	public void setImag(double b) {
		this.imaginario = b;
	}
	
	// (a, b) + (c, d) = (a + c, b + d);
	public Complejo sumar(Complejo c) {
		Complejo cAux;
		double real = this.real + c.real;
		double imag = this.imaginario + c.imaginario;
		cAux = new Complejo(real, imag);
		return cAux;
	}
	
	// (a, b) - (c, d) = (a - c, b - d);
	public Complejo restar(Complejo c) {
		Complejo cAux;
		double real = this.real - c.real;
		double imag = this.imaginario - c.imaginario;
		cAux = new Complejo(real, imag);
		return cAux;
	}
	
	// (a, b) * (c, d) = (a * c - b * d, a * d + b * c)
	public Complejo multiplicar(Complejo c) {
		Complejo cAux;
		double real = this.real * c.real - this.imaginario * c.imaginario;
		double imag = this.real * c.imaginario + this.imaginario * c.real;
		cAux = new Complejo(real, imag);
		return cAux;
	}
	
	// (a, b) * n = (a * n, b * n)
	public Complejo multiplicar(double n) {
		Complejo cAux;
		double real = this.real * n;
		double imag = this.imaginario * n;
		cAux = new Complejo(real, imag);
		return cAux;
	}
	
	// (a, b) / (c, d) = ((a * c + b * d) / (c^2 + d^2), (b * c - a * d) / (c^2 + d^2)) 
	public Complejo dividir(Complejo c) {
		Complejo cAux;
		double realP1 = this.real * c.real + this.imaginario * c.imaginario;
		double C2e2 = Math.pow(c.real, 2) + Math.pow(c.imaginario, 2);
		double real = realP1 / C2e2;
		double imagP1 = this.imaginario * c.real - this.real * c.imaginario;
		double imag = imagP1 / C2e2;
		cAux = new Complejo(real, imag);
		return cAux;
	}

	@Override
	public String toString() {
		return "(" + real + ", " + imaginario + ")";
	}
	
	public boolean equals(Complejo c) {
		if(this.real == c.real && this.imaginario == c.imaginario)
			return true;
		return false;
	}
	
}
