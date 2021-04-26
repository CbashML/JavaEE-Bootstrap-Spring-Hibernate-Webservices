package com.sebastian.ejercicios.poo.pruebas.entidades.cuadro;

import java.util.Scanner;

import com.sebastian.ejercicios.poo.entidades.Fecha;
import com.sebastian.ejercicios.poo.entidades.cuadro.Autor;
import com.sebastian.ejercicios.poo.entidades.cuadro.Cuadro;
import com.sebastian.ejercicios.poo.entidades.cuadro.TamanhoLienzo;

public class RellenarCuadro {
	
	public Cuadro run(Scanner scanner) {
		Cuadro cuadro; 
		Autor autor;
		Fecha fechaDeNacimiento;
		TamanhoLienzo tamanhoLienzo;
		System.out.println("Running...");
		System.out.println("Introduzca el titulo:");
		String titulo = scanner.nextLine();
		
		System.out.println("Introduzca el nombre del autor:");
		String nombre = scanner.nextLine();
		
		System.out.println("Introduzca el apellido del autor:");
		String apellidos = scanner.nextLine();
		
		System.out.println("Introduzca si el autor ha fallecido:");
		boolean fallecido = scanner.nextBoolean();
		
		System.out.println("Introduzca la fecha de nacimiento:");
		System.out.println("Año yyyy:");
		int anhoDeNacimiento = scanner.nextInt();
		System.out.println("Mes mm:");
		int mesDeNacimiento = scanner.nextInt();
		System.out.println("Día dd:");
		int diaDeNacimiento = scanner.nextInt();
		
		System.out.println("Introduzca la altura del lienzo:");
		float altura = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Introduzca la anchura del lienzo:");
		float anchura = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Introduzca el año");
		int anho = scanner.nextInt();
		
		System.out.println("Introduzca si el cuadro ha sido restaurado:");
		boolean restaurado = scanner.nextBoolean();
		
		System.out.println("Introduzca el precio:");
		double precio = scanner.nextDouble();
		scanner.nextLine();
		
		fechaDeNacimiento = new Fecha(diaDeNacimiento, mesDeNacimiento, anhoDeNacimiento);
		autor = new Autor(nombre, apellidos, fallecido, fechaDeNacimiento);
		tamanhoLienzo = new TamanhoLienzo(altura, anchura);
		cuadro = new Cuadro(titulo, autor, tamanhoLienzo, anho, restaurado, precio);
		System.out.println(cuadro);
		System.out.println("Finished...");
		return cuadro;
	}
}
