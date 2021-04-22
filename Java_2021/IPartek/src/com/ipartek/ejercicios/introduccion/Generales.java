package com.ipartek.ejercicios.introduccion;

import java.util.Scanner;

public class Generales {

	public void intercambiarVariable() {
		Scanner scanner = new Scanner(System.in);
		int a, b, tmp;

		System.out.println("Introducir una variable (a):");
		a = Integer.valueOf(scanner.nextLine());

		System.out.println("Introducir una variable (b):");
		b = Integer.valueOf(scanner.nextLine());
		scanner.close();

		tmp = a;
		a = b;
		b = tmp;
		imprimirIntercabiarVariable(a, b);
	}

	private void imprimirIntercabiarVariable(int a, int b) {
		String chainText = String.format("a = %s, b = %s", a, b);
		System.out.println(chainText);
	}

	public void centToKelvin() {
		char again;
		Scanner scanner = new Scanner(System.in);

		do {
			float c;
			System.out.println("Introduce temperatura en grados centigrados:");
			c = scanner.nextFloat();
			scanner.nextLine();

			getKelvinFromCentig(c);

			System.out.println("¿Repetir proceso? (S/N)");
			again = scanner.next().charAt(0);
			System.out.println(again);
		} while (Character.toUpperCase(again) == 'S');

		scanner.close();
	}

	private void getKelvinFromCentig(float c) {
		float k = c + 273;
		String chainText = String.format("La temperatura en kelvins es %1.2f", k);
		System.out.println(chainText);
	}

	private void calcularNota() {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Introduce el numero de estudiantes:");
			int students = scanner.nextInt();
			scanner.nextLine();

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

	public void fibonacci() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fibonacci(n) -> Introduce N:");
		int n = Integer.valueOf(scanner.nextLine());
		scanner.close();
		imprimirFibonacci(n);
	}

	private void imprimirFibonacci(int n) {
		String chainText = String.format("Fibonacci(%d) = %d", n, fibonacci(n));
		System.out.println(chainText);
	}

	private int fibonacci(int n) {
		if ((n == 0) || (n == 1))
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		Generales generales = new Generales();
//		generales.intercambiarVariable();
//		generales.centToKelvin();
		generales.calcularNota();
		generales.fibonacci();
	}

}
