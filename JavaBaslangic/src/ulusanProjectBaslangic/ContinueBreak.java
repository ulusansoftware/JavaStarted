package ulusanProjectBaslangic;

import java.util.Scanner;

public class ContinueBreak {
	public static void main(String[] args) {
		// break => d�ng�y� durdurur.
		// continue => d�ng�y� durdurmaz bir sonraki ad�ma gider.

		try (Scanner scan = new Scanner(System.in)) {
		}

		/*
		 * int sayi; while (true) { System.out.println("Bir say� giriniz :"); sayi =
		 * scan.nextInt(); if (sayi == 0) { System.out.println("D�ng� Bitti"); break; }
		 * System.out.println(sayi); }
		 */
		for (int i = 1; i <= 50; i++) {
			if(i==5 || i==10 || i==15 || i==20 || i==25 || i==30 || i==30 || i==35 || i==40 || i==45 || i==50) {
				System.out.println("atlad�="+i);
				continue;
			}
			System.out.println("i="+i);

		}
	}
}