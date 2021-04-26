package com.ipartek.ejercicios.poo.pruebas.entidades.cuadro;

import java.util.Scanner;

import com.ipartek.ejercicios.poo.entidades.cuadro.Cuadro;

public class PruebaCruadro {
	
	public static void main(String[] args) {
		
		Cuadro[] cuadros = new Cuadro[10];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < cuadros.length; i++) {
			RellenarCuadro rellenarCuadro = new RellenarCuadro();
			cuadros[i] = rellenarCuadro.run(scanner);
		}
		scanner.close();
		
		for (int i = 0; i < cuadros.length; i++) {
			System.out.println(cuadros[i]);
		}
		
	}
}
