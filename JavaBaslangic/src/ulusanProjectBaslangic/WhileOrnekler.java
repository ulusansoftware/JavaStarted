package ulusanProjectBaslangic;

import java.util.Scanner;

public class WhileOrnekler {

	public static void main(String[] args) {
		// Ornek1 :1'den 100'e kadar �ift say�lar� ekrana yazan program
		// Ornek2 :Negatif bir de�er girilene kadar kullan�c�dan giri�leri kabul eden ve
		// giriler de�erlerden tek say�lara toplayan program
		// Ornek3 :Girilen say�ya kadar olan 2'nin kuvvetleri
		/*
		 * �rnek1 int i =1; while(i <=100) { if(i % 2 ==0) { System.out.println(i); }
		 * 
		 * i++; }
		 */
		/*
		 * �rnek2 Scanner scan = new Scanner(System.in); int toplam=0; int input;
		 * while(true) { System.out.println("L�tfen Say� Giriniz :"); input=
		 * scan.nextInt(); if(input<0) {
		 * System.out.println("Program Bitti Negatif Say� Girdiniz!!!");
		 * 
		 * break; } if(input %2 == 1) { toplam = toplam + input; } }
		 * 
		 * System.out.println("Girilen tek say�lar toplam� :" + toplam );
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Say� Giriniz:");
		int input = scan.nextInt();
		int k = 1;
		while (k <= input) {
			System.out.println(k);
			k = k * 2;
		}

	}

}
