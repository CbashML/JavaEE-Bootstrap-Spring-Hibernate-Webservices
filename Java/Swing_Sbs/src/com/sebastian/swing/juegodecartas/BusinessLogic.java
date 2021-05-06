package com.sebastian.swing.juegodecartas;

import java.util.ArrayList;
import java.util.Random;

public class BusinessLogic {

	public int getRanomInteger(int upperBound) {
		Random rnd = new Random();
		return rnd.nextInt(upperBound);
	}

	private ArrayList<Carta> getCartasOrdenadas() {
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		for (int i = 1; i <= 13; i++) {
			cartas.add(new Carta(i, "Diamantes"));
			cartas.add(new Carta(i, "Picas"));
			cartas.add(new Carta(i, "Trebol"));
			cartas.add(new Carta(i, "Corazones"));
		}
		return cartas;
	}
	
	private ArrayList<Carta> desordenarCartas(ArrayList<Carta> cartas){
		int upperBound = cartas.size();
		for (int i = 0; i < 3; i++) 
			desordenar(cartas, upperBound);
		return cartas;
	}

	private void desordenar(ArrayList<Carta> cartas, int upperBound) {
		int rnd;
		for (int i = 0; i < cartas.size(); i++) {
			rnd = getRanomInteger(upperBound);
			swap(cartas, i, rnd);
		}
	}
	
	private void swap(ArrayList<Carta> arr, int i, int rnd) {
		Carta tmp = arr.get(i);
		arr.set(i, arr.get(rnd));
		arr.set(rnd, tmp);
	}

	private void imprimirCartas(ArrayList<Carta> cartas) {
		for (Carta carta : cartas) 
			System.out.println(carta.getNum() + " de " + carta.getTipo());
	}
	
	public ArrayList<Carta> getCartas(){
		ArrayList<Carta> cartas = getCartasOrdenadas();
		return desordenarCartas(cartas);
	}
	
	public static void main(String[] args) {
		BusinessLogic bl = new BusinessLogic();
		ArrayList<Carta> cartas = bl.getCartasOrdenadas();
		ArrayList<Carta> cartasDesordenadas = bl.desordenarCartas(cartas);
		bl.imprimirCartas(cartasDesordenadas);
	}
}
