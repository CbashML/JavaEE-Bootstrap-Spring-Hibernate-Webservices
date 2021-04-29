package com.sebastian.pruebas.prueba2;

import java.util.ArrayList;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Coche> coches = new ArrayList<Coche>();
		
		introducirCoches(coches);
		
		mostrarCoches(coches);
	}

	// Nos permite rellenar la lista de coches utilizando la función introducirCoche
	private static void introducirCoches(ArrayList<Coche> coches) {
		boolean continuar = false;
		pl("Introducir coches a la lista");
		
		do {
			coches.add(introducirCoche());
			continuar = leerBoolean("¿Quieres introducir otro coche? ");
		} while (continuar);
	}

	// Nos permite introducir los valores de los arributos del coche por teclado
	private static Coche introducirCoche() {
		String matricula, marca, modelo, color;
		int potencia;
		float cilindrada;
		
		matricula = leerString("Introduce la matricula");
		marca = leerString("Introduce la marca");
		modelo = leerString("Introduce el modelo");
		color = leerString("Introduce el color");
		potencia = leerInt("Introcude la potencia");
		cilindrada = (float) leerFloat("Introcude la cilindrada");
		
		return new Coche(matricula, marca, modelo, color, potencia, cilindrada);
	}

	// Nos muestra la lista de coches introducidos.
	private static void mostrarCoches(ArrayList<Coche> coches) {
		pl("Mostrar coches:");
		for (Coche coche : coches) 
			pl(coche);
	}
}
