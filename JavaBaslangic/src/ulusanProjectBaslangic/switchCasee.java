package ulusanProjectBaslangic;

import java.util.Scanner;

public class switchCasee {
	public static void main(String args[]) {
		Scanner giris = new Scanner(System.in);
		int secim;

		System.out.println("Secim yapiniz (1 - 2 - 3)");
		secim = giris.nextInt();

		switch (secim) {
		case 1:
			System.out.println("A sinifi dergilerin listesi");
			break;

		case 2:
			System.out.println("B sinifi dergilerin listesi");
			break;

		case 3:
			System.out.println("C sinifi dergilerin listesi");
			break;

		default:
			System.out.println("Hatali secim! 1, 2 ya da 3'e basiniz.");
			break;
		}
	}
}