package com.sebastian.swing.historia;

import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BusinessLogic {

	private int getRandomInteger() {
		Random rnd = new Random();
		int upperBound = 3;
		return rnd.nextInt(upperBound);
	}

	public String[] getHistoryAndDescriptionFromCsv() {
		String line;
		String[] data = null;
		int n = getRandomInteger() + 1;

		try (FileReader fr = new FileReader("resources\\historia.csv"); Scanner sc = new Scanner(fr)) {
			sc.nextLine();

			while (sc.hasNextLine() && n != 0) {
				line = sc.nextLine();
				data = line.split(";");
				n--;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}

	public String getStringForTextFieldOf(int buffer, String str) {
		StringBuffer sb = new StringBuffer();
		int idx = 0;
		while (idx++ != str.length() - 1) {
			sb.append(str.charAt(idx));
			if (idx % buffer == 0)
				sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		BusinessLogic bl = new BusinessLogic();
		String[] arrOfStr = bl.getHistoryAndDescriptionFromCsv();
		String text = String.format("%s \n\t D>> %s", bl.getStringForTextFieldOf(50, arrOfStr[0]), arrOfStr[1]);
		System.out.println(text);
	}

}
