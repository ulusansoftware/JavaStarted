package ulusanProjectBaslangic;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		int bakiye =1000, input;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome To The Ulusan Bank !!");
		System.out.println("Güncel Bakiyeniz: " + bakiye + " TL ");
		
		while (bakiye > 0) {
			System.out.println();
			System.out.println("1-) Para Yatýr.");
			System.out.println("2-) Para Çek.");
			System.out.println("3-) Bakiye Sorgula.");
			System.out.println("4-) Çýkýþ Yap");
			System.out.print("Yapmak Ýstediðiniz Ýþlemi Seçiniz :");
			input =scan.nextInt();
		}
		
		System.out.println("TEKRAR BEKLERÝZ !");
		
	}

}
