package com.sebastian.pruebas.prueba2;

public class Coche {
	
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private int potencia;
	private float cilindrada;
	
	// Constructor de clase.
	public Coche(String matricula, String marca, String modelo, String color, int potencia, float cilindrada) {
		super();
		setMatricula(matricula);
		setMarca(marca);
		setModelo(modelo);
		setColor(color);
		setPotencia(potencia);
		setCilindrada(cilindrada);
	}  
	
	// Getters y setter tipicos de la clase, referentes a los atributos.
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public float getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	// toString que nos permite mostrar los atributos del coche por pantalla.
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", potencia=" + potencia + ", cilindrada=" + cilindrada + "]";
	}
}
