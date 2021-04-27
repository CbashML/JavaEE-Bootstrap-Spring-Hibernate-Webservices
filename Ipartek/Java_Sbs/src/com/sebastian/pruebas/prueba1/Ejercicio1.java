package com.sebastian.pruebas.prueba1;

import java.util.Scanner;

public class Ejercicio1 {

	private void calcularNota() {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("El número de estudiantes es 5:");
			int students = 5;

			float[] arr = new float[students];
			float mark;
			for (int i = 0; i < arr.length; i++)
				do {
					String text = String.format("introduce la nota del estudiante [%d]", i + 1);
					System.out.println(text);
					mark = scanner.nextFloat();
					scanner.nextLine();
					arr[i] = mark;
				} while (mark <= 0);
			
			imprimirInformacionDeCalcularNota(arr);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void imprimirInformacionDeCalcularNota(float[] arr) {
		float bigger = getBigger(arr);
		float lower = getLower(arr);
		float mean = getMean(arr);
		
		String biggerString = String.format("La nota mayor es: %1.2f \n", bigger);
		String lowerString = String.format("La nota menor es: %1.2f \n", lower);
		String meanString = String.format("La nota media es: %1.2f \n", mean);
		
		StringBuffer sb = new StringBuffer();
			sb.append(biggerString)
			.append(lowerString)
			.append(meanString);
		
		System.out.println(sb.toString());
	}

	private float getMean(float[] arr) {
		int sum = 0;
		int N = arr.length;
		for (int i = 0; i < N; i++)
			sum += arr[i];
		return sum/N;
	}

	private float getLower(float[] arr) {
		float min = arr[0];
		for (int i = 0; i < arr.length; i++) 
			if (arr[i] < min)
				min = arr[i];
		return min;
	}

	private float getBigger(float[] arr) {
		float max = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}
	
	public static void main(String[] args) {
		Ejercicio1 e1 = new Ejercicio1();
		e1.calcularNota();
	}
}
