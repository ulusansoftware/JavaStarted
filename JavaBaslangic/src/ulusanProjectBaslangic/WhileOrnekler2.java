package ulusanProjectBaslangic;

import java.util.Scanner;

public class WhileOrnekler2 {

	public static void main(String[] args) {
		// Ornek 1 : Faktoriyel hesaplama
		// Ornek 2 : Harmonik Say�lar
		// Ornek 3 : Y�ld�zlar ile ��gen yapma
		// Ornek 4 : �sl� say� hesaplama

		/*
		 * ornek1 Scanner scan = new Scanner(System.in);
		 * System.out.print("Fakt�riyel Say�s� Giriniz :"); int f = scan.nextInt(); int
		 * sonuc = 1 ; while(f > 0) { sonuc *= f; f--; } System.out.print(sonuc);
		 */

		/*
		 * �rnek2 Scanner scan = new Scanner(System.in);
		 * System.out.print("Harmonik Say�s� Giriniz :"); double h = scan.nextDouble();
		 * double harmonic = 0.0; while(h>0 ) { harmonic = harmonic + 1/h ; h--; }
		 * System.out.print(harmonic);
		 */

		/*
		 * �rnek 3 Scanner scan = new Scanner(System.in);
		 * System.out.println("L�tfen bir say� giriniz:"); int star = scan.nextInt();
		 * int i = 1; while (i <= star) { int k = 1; while (k <= i) {
		 * System.out.print("*"); k++; } System.out.println(); i++; }
		 */
		Scanner scan = new Scanner(System.in);
		int sayi1, sayi2, sonuc = 1;
		System.out.print("�ss� al�nacak say� :");
		sayi1 = scan.nextInt();
		System.out.print("�s olacak say� :");
		sayi2 = scan.nextInt();
		int i = 1;
		while (i <= sayi2) {
			sonuc = sonuc * sayi1;
			i++;
		}
		System.out.print("Sonu�: " + sonuc);
	}

}
