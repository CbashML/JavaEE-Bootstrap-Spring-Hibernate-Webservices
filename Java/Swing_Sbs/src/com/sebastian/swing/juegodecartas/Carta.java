package com.sebastian.swing.juegodecartas;

public class Carta {

	private int num;
	private String tipo;
	
	public Carta(int num, String tipo) {
		super();
		this.num = num;
		this.tipo = tipo;
	}

	public int getNum() {
		return num;
	}

	public String getTipo() {
		return tipo;
	}
	
}
