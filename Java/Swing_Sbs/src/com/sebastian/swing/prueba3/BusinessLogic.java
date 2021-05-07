package com.sebastian.swing.prueba3;

import java.util.ArrayList;
import java.util.Random;

public class BusinessLogic {

	// Obtenemos un número random de 0 a la cota superior indicada.
	private int getRandNumberFrom0To(int upperBound) {
		Random rnd = new Random();
		return rnd.nextInt(upperBound) + 1;
	}
	
	// Obtenemos un array de 5 números random del 1 al 50
	public ArrayList<Integer> getArrOf5NumFrom1To50() {
		int limit = 5;
		int upperBound = 50;
		return getArrOfRandNumbers(limit, upperBound);
	}
	
	// Obtenemos un array de 5 números random del 1 al 12
	public ArrayList<Integer> getArrOf2NumFrom1To12() {
		int limit = 2;
		int upperBound = 12;
		return getArrOfRandNumbers(limit, upperBound);
	}

	// Obtenemos un array de (@Param limit) números random del 1 a la cota superior.
	private ArrayList<Integer> getArrOfRandNumbers(int limit, int randomUpperBound) {
		ArrayList<Integer> arr = new ArrayList<Integer>(limit);
		int n = 0;
		while (n < limit) {
			int rndNum = getRandNumberFrom0To(randomUpperBound);
			n = addNumberToArr(arr, n, rndNum);
		}
		return arr;
	}

	//Añade un número al array
	private int addNumberToArr(ArrayList<Integer> arr, int n, int rndNum) {
		if(!arr.contains(rndNum)) {
			n++;
			arr.add(rndNum);
		}
		return n;
	}
	
}
