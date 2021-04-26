package com.ipartek.ejercicios.poo.entidades.jerarquia.empleado;

public class Operario extends Empleado{

	public Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return  super.toString() + " -> Operario";
	}
	
}
