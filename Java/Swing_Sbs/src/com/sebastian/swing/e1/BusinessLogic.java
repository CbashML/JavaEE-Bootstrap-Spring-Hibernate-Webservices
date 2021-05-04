package com.sebastian.swing.e1;

import java.util.Random;

public class BusinessLogic {

	public int[] conseguir5NumerosAleatorios() {
		int[] intRandNumbers = new int[5];
		Random rand = new Random(); // instance of random class
		int upperbound = 10;
		// generate random values from 0-9
		for (int i = 0; i < intRandNumbers.length; i++)
			intRandNumbers[i] = rand.nextInt(upperbound);

		return intRandNumbers;
	}

	public int cuantosIgualesEnReversa(int[] arr1, int[] arr2) {
		int quantity = 0;
		for (int i = arr1.length - 1; i >= 0; i--) {
			if (arr1[i] != arr2[i])
				break;
			quantity++;
		}
		return quantity;
	}

	public int getPremio(int aciertos) {
		int premio = 0;

		switch (aciertos) {
		case 1:
			premio = 2;
			break;
		case 2:
			premio = 10;
			break;
		case 3:
			premio = 50;
			break;
		case 4:
			premio = 500;
			break;
		case 5:
			premio = 10000;
			break;
		}

		return premio;
	}

}
