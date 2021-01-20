package ulusanProjectBaslangic;

import java.util.Scanner;

public class ContinueBreak {
	public static void main(String[] args) {
		// break => döngüyü durdurur.
		// continue => döngüyü durdurmaz bir sonraki adýma gider.

		try (Scanner scan = new Scanner(System.in)) {
		}

		/*
		 * int sayi; while (true) { System.out.println("Bir sayý giriniz :"); sayi =
		 * scan.nextInt(); if (sayi == 0) { System.out.println("Döngü Bitti"); break; }
		 * System.out.println(sayi); }
		 */
		for (int i = 1; i <= 50; i++) {
			if(i==5 || i==10 || i==15 || i==20 || i==25 || i==30 || i==30 || i==35 || i==40 || i==45 || i==50) {
				System.out.println("atladý="+i);
				continue;
			}
			System.out.println("i="+i);

		}
	}
}