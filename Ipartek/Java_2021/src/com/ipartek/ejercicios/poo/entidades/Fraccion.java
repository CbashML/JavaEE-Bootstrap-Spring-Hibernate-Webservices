package com.ipartek.ejercicios.poo.entidades;

public class Fraccion {

	private int num;
	private int den;

	public Fraccion() {
		this.num = 0;
		this.den = 1;
	}
	
	public Fraccion(int num, int den) {
		setNum(num);
		if (getDen() == 0)
			setDen(1);
		setDen(den);
		simplificar();
	}

	public Fraccion(int num) {
		setNum(num);
		setDen(1);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	private void simplificar() {
		int mcd = mcd();
		this.num = this.num / mcd;
		this.den = this.den / mcd;
	}

	private int mcd() {
		int num = Math.abs(this.num); //valor absoluto del numerador
        int den = Math.abs(this.den); //valor absoluto del denominador
        if (den == 0) {
            return num;
        }
        int resto;
        while (den != 0) {
            resto = num % den;
            num = den;
            den = resto;
        }
        return num;
	}
	
	public Fraccion sumar(Fraccion f) {
		Fraccion fAux;
		int num = this.num * f.den + this.den * f.num;
		int den = this.den * f.den;
		fAux = new Fraccion(num, den);
		fAux.simplificar();
		return fAux;
	}

	public Fraccion restar(Fraccion f) {
		Fraccion fAux;
		int num = this.num * f.den - this.den * f.num;
		int den = this.den * f.den;
		fAux = new Fraccion(num, den);
		fAux.simplificar();
		return fAux;
	}
	
	public Fraccion multiplicar(Fraccion f) {
		Fraccion fAux;
		int num = this.num * f.num;
		int den = this.den * f.den;
		fAux = new Fraccion(num, den);
		fAux.simplificar();
		return fAux;
	}
	
	public Fraccion dividir(Fraccion f) {
		Fraccion fAux;
		int num = this.num * f.den;
		int den = this.den * f.num;
		fAux = new Fraccion(num, den);
		fAux.simplificar();
		return fAux;
	}
	
	@Override
	public String toString() {
		return num + "/" + den;
	}
	
}
