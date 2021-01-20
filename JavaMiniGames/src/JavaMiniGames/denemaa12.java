package JavaMiniGames;

import java.util.Scanner;

public class denemaa12 {

	public static void main(String[] args) {
		Scanner tarayici = new Scanner(System.in);
		String dersler[] = new String[3];
		int notlar[] = new int[3];
		for (int i = 0; i < dersler.length; i++) {
			System.out.println("Ders Adýný Giriniz");
			dersler[i] = tarayici.next();
			System.out.println((i + 1) + ". dersin notunu giriniz");
			notlar[i] = tarayici.nextInt();
		}
		int toplam = 0;
		for (int k = 0; k < notlar.length; k++) {
			System.out.println(dersler[k] + " : " + notlar[k]);
			toplam = toplam + notlar[k];
		}
		System.out.println("Ortalama : " + toplam / 3);
	}
}