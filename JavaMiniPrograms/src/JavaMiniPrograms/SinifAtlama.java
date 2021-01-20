package JavaMiniPrograms;

import java.util.Scanner;

public class SinifAtlama {

	private static Scanner scan;

	public static void main(String[] args) {
		// T�rk�e,Matematik,Fen Bilgisi,Sosyal Bilgisi,Beden E�itimi notlar� girilsin
		// Notlar�n Ortalamas� Hesaplans�n
		// Ortalama 50'den a�a�� ise s�n�fta kals�n de�ilse s�n�f� ge�sin
		int turkce, matematik, fenBilgisi, sosyalBilgisi, bedenEgitimi;
		double ortalama = 0;

		scan = new Scanner(System.in);

		System.out.print("T�rk�e notunu giriniz : ");
		turkce = scan.nextInt();
		System.out.print("Matematik notunu giriniz : ");
		matematik = scan.nextInt();
		System.out.print("\n Fen Bilgisi notunu giriniz: ");
		fenBilgisi = scan.nextInt();
		System.out.print("\n Sosyal Bilgisi notunu giriniz:");
		sosyalBilgisi = scan.nextInt();
		System.out.print("\n Beden E�itimi notunu giriniz: ");
		bedenEgitimi = scan.nextInt();
		ortalama = (turkce + fenBilgisi + matematik + sosyalBilgisi + bedenEgitimi) / 5;
		if (ortalama < 50) {
			System.out.println("S�n�fta Kald�n�z! Bay BAAAAAY");
		} else {
			System.out.println("S�n�f� Ba�ar�yla Ge�tiniz Helal olsun");
		}
		System.out.println("S�n�f ortalaman�z :" + ortalama);
	}

}
