package ulusanProjectBaslangic;

import java.util.Scanner;

public class WhileOrnekler {

	public static void main(String[] args) {
		// Ornek1 :1'den 100'e kadar çift sayýlarý ekrana yazan program
		// Ornek2 :Negatif bir deðer girilene kadar kullanýcýdan giriþleri kabul eden ve
		// giriler deðerlerden tek sayýlara toplayan program
		// Ornek3 :Girilen sayýya kadar olan 2'nin kuvvetleri
		/*
		 * Örnek1 int i =1; while(i <=100) { if(i % 2 ==0) { System.out.println(i); }
		 * 
		 * i++; }
		 */
		/*
		 * Örnek2 Scanner scan = new Scanner(System.in); int toplam=0; int input;
		 * while(true) { System.out.println("Lütfen Sayý Giriniz :"); input=
		 * scan.nextInt(); if(input<0) {
		 * System.out.println("Program Bitti Negatif Sayý Girdiniz!!!");
		 * 
		 * break; } if(input %2 == 1) { toplam = toplam + input; } }
		 * 
		 * System.out.println("Girilen tek sayýlar toplamý :" + toplam );
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayý Giriniz:");
		int input = scan.nextInt();
		int k = 1;
		while (k <= input) {
			System.out.println(k);
			k = k * 2;
		}

	}

}
