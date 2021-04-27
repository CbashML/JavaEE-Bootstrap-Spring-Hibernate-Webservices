package com.sebastian.ejercicios.poo.pruebas.entidades.jerarquia.pruebas;

import com.sebastian.ejercicios.poo.entidades.jerarquia.empleado.Directivo;
import com.sebastian.ejercicios.poo.entidades.jerarquia.empleado.Empleado;
import com.sebastian.ejercicios.poo.entidades.jerarquia.empleado.Operario;
import com.sebastian.ejercicios.poo.entidades.jerarquia.empleado.operario.Oficial;
import com.sebastian.ejercicios.poo.entidades.jerarquia.empleado.operario.Tecnico;

public class PruebaJerarquiaEmpleado {

	public static void main(String[] args) {
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Alfonso");                                                                           
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
	}
}
