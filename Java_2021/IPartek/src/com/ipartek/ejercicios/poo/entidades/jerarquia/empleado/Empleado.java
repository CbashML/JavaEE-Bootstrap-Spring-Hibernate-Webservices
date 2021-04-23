package com.ipartek.ejercicios.poo.pruebas.entidades.jerarquia.empleado;

public class Empleado {
	private String Nombre;
	
	public Empleado(String nombre) {
		setNombre(nombre);
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado [Nombre=" + Nombre + "]";
	}
	
}
