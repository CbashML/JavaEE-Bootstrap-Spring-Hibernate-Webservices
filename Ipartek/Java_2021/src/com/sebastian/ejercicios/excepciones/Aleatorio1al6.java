package com.sebastian.ejercicios.excepciones;

import java.io.IOException;
import java.util.Random;

public class Aleatorio1al6 {

	public static void lanzarExcepcionAleatoria() {
		int rand = new Random().nextInt(6) + 1;
		
		switch (rand) {
		case 1:
			try {
				throw new ArithmeticException();
			} catch (ArithmeticException ae) {
				System.out.println(ae.toString());
			}
			break;
		case 2:
			try {
				throw new NullPointerException();
			} catch (NullPointerException npe) {
				System.out.println(npe.toString());
			}
			break;
		case 3:
			try {
				throw new NumberFormatException();
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.toString());
			}
			break;
		case 4:
			try {
				throw new SecurityException();
			} catch (SecurityException se) {
				System.out.println(se.toString());
			}
			break;
		case 5:
			try {
				throw new NegativeArraySizeException();
			} catch (NegativeArraySizeException nase) {
				System.out.println(nase.toString());
			}
			break;
		case 6:
			try {
				throw new IOException();
			} catch (IOException ioe) {
				System.out.println(ioe.toString());
			}
			break;
		}
	}

	public static void main(String[] args) {
		lanzarExcepcionAleatoria();
	}

}
