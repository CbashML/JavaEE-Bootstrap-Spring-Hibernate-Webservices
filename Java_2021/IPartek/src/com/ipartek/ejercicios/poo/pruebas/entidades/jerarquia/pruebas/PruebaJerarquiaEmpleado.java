package com.ipartek.ejercicios.poo.pruebas.entidades.jerarquia.pruebas;

import com.ipartek.ejercicios.poo.pruebas.entidades.jerarquia.empleado.Directivo;
import com.ipartek.ejercicios.poo.pruebas.entidades.jerarquia.empleado.Empleado;
import com.ipartek.ejercicios.poo.pruebas.entidades.jerarquia.empleado.Operario;
import com.ipartek.ejercicios.poo.pruebas.entidades.jerarquia.empleado.operario.Oficial;
import com.ipartek.ejercicios.poo.pruebas.entidades.jerarquia.empleado.operario.Tecnico;

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
