package com.ipartek.pruebas.prueba1;

import java.util.Scanner;

public class Ejercicio2 {

	private Scanner scanner = new Scanner(System.in);
	
	public void desplegarMenu() {
		introducirOpcion(getOpciones());
	}

	private StringBuffer getOpciones() {
		StringBuffer opcionesSB = new StringBuffer();

		String opcion1 = "(1) Calcular la letra de DNI. \n";
		String opcion2 = "(2) Convertir de cm a pulgadas. \n";
		String opcion3 = "(3) Salir \n";

		opcionesSB.append(opcion1).append(opcion2).append(opcion3);
		return opcionesSB;
	}

	private void introducirOpcion(StringBuffer opcionesSB) {
			int opcion;
			do {
				System.out.println(opcionesSB.toString());
				opcion = Integer.parseInt(scanner.nextLine());
			} while (!(opcion > 0) && !(opcion <= 3));
			elegirOpcion(opcion);
	}

	private void elegirOpcion(int opcion) {
		if (opcion == 1)
			calculoLetraDNI();
		if (opcion == 2)
			convertirCMaPulgadas();
		if (opcion == 3) {
			scanner.close();
			return;
		}
		introducirOpcion(getOpciones());
	}

	private void calculoLetraDNI() {
		String DNISinLetra;
		do {
			System.out.println("Introduce los números del DNI para obtener la letra:");
			DNISinLetra = scanner.nextLine();
			
		} while (DNISinLetra.length() != 8);
		calcularLetraDNI(Integer.parseInt(DNISinLetra));
	}

	private void calcularLetraDNI(int DNISinLetra) {
		char[] lestrasDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int posicion = DNISinLetra % 23;
		char LetraDNI = lestrasDNI[posicion];
		String DNI = String.valueOf(DNISinLetra) + LetraDNI;
		System.out.println("Tú DNI con letra es el siguiente: \n" + DNI + "\n");
	}

	private void convertirCMaPulgadas() {
			System.out.println("Introduce los cm que quieres convertir a pulgas:");
			float cm = Float.parseFloat(scanner.nextLine());
			double pulgadas = cm * 0.393701;
			String text = String.format("%1.2f cm en pulgadas equivale a %1.6f. \n", cm, pulgadas);
			System.out.println(text);
	}

	public static void main(String[] args) {
		Ejercicio2 e2 = new Ejercicio2();
		e2.desplegarMenu();
	}
}
