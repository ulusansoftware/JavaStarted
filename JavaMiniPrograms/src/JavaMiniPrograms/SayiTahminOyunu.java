package JavaMiniPrograms;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		int tahmin, can = 5, i = 0;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int sayi = rand.nextInt(10);
		boolean oyunDurum = false, hata = false;
		int[] tahminler = new int[5];
		System.out.println(sayi);
		System.out.println("SAYI TAHMIN OYUNUNA HOSGELDINIZ !!");
		System.out.println("0 -19 ARASINDA BIR SAYI TUTTUM .");
		while (can > 0) {
			System.out.println("Tahmininiz :");
			tahmin = scan.nextInt();

			if (tahmin < 0 || (tahmin > 19)) {
				if (hata) {
					System.out.println("Cok Fazla Hatali Giri� Yaptiniz 1 Can Kaybettiniz");
					System.out.println("Kalan Can : " + --can);
					can--;
				} else {
					hata = true;
					System.out.println("L�tfen 0-19 arasi bir sayi giriniz.");
				}
				continue;
			}
			tahminler[i++] = tahmin;
			if (tahmin == sayi) {
				oyunDurum = true;
				break;

			} else {
				System.out.println("YANLIS TEKRAR DENEYINIZ ! KALAN CAN :" + --can);
			}
		}
		if (oyunDurum) {
			System.out.println("TEBRIKLER DO�RU TAHM�N !!");
			System.out.println("SAYIMIZ :" + sayi);
			System.out.println("KALAN CAN :" + can);
		} else {
			System.out.println("BA�ARAMADINIZ !");
		}
		System.out.println("TAHM�NLER�N�Z :");
		for (int value : tahminler) {
			if (value != 0)
				System.out.println(value + ",");
		}
	}
}
