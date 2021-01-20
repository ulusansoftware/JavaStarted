package ulusanProjectBaslangic;

import java.util.Scanner;

public class WhileOrnekler2 {

	public static void main(String[] args) {
		// Ornek 1 : Faktoriyel hesaplama
		// Ornek 2 : Harmonik Sayýlar
		// Ornek 3 : Yýldýzlar ile üçgen yapma
		// Ornek 4 : Üslü sayý hesaplama

		/*
		 * ornek1 Scanner scan = new Scanner(System.in);
		 * System.out.print("Faktöriyel Sayýsý Giriniz :"); int f = scan.nextInt(); int
		 * sonuc = 1 ; while(f > 0) { sonuc *= f; f--; } System.out.print(sonuc);
		 */

		/*
		 * Örnek2 Scanner scan = new Scanner(System.in);
		 * System.out.print("Harmonik Sayýsý Giriniz :"); double h = scan.nextDouble();
		 * double harmonic = 0.0; while(h>0 ) { harmonic = harmonic + 1/h ; h--; }
		 * System.out.print(harmonic);
		 */

		/*
		 * Örnek 3 Scanner scan = new Scanner(System.in);
		 * System.out.println("Lütfen bir sayý giriniz:"); int star = scan.nextInt();
		 * int i = 1; while (i <= star) { int k = 1; while (k <= i) {
		 * System.out.print("*"); k++; } System.out.println(); i++; }
		 */
		Scanner scan = new Scanner(System.in);
		int sayi1, sayi2, sonuc = 1;
		System.out.print("Üssü alýnacak sayý :");
		sayi1 = scan.nextInt();
		System.out.print("Üs olacak sayý :");
		sayi2 = scan.nextInt();
		int i = 1;
		while (i <= sayi2) {
			sonuc = sonuc * sayi1;
			i++;
		}
		System.out.print("Sonuç: " + sonuc);
	}

}
