package JavaMiniPrograms;

import java.util.Scanner;

public class SinifAtlama {

	private static Scanner scan;

	public static void main(String[] args) {
		// Türkçe,Matematik,Fen Bilgisi,Sosyal Bilgisi,Beden Eðitimi notlarý girilsin
		// Notlarýn Ortalamasý Hesaplansýn
		// Ortalama 50'den aþaðý ise sýnýfta kalsýn deðilse sýnýfý geçsin
		int turkce, matematik, fenBilgisi, sosyalBilgisi, bedenEgitimi;
		double ortalama = 0;

		scan = new Scanner(System.in);

		System.out.print("Türkçe notunu giriniz : ");
		turkce = scan.nextInt();
		System.out.print("Matematik notunu giriniz : ");
		matematik = scan.nextInt();
		System.out.print("\n Fen Bilgisi notunu giriniz: ");
		fenBilgisi = scan.nextInt();
		System.out.print("\n Sosyal Bilgisi notunu giriniz:");
		sosyalBilgisi = scan.nextInt();
		System.out.print("\n Beden Eðitimi notunu giriniz: ");
		bedenEgitimi = scan.nextInt();
		ortalama = (turkce + fenBilgisi + matematik + sosyalBilgisi + bedenEgitimi) / 5;
		if (ortalama < 50) {
			System.out.println("Sýnýfta Kaldýnýz! Bay BAAAAAY");
		} else {
			System.out.println("Sýnýfý Baþarýyla Geçtiniz Helal olsun");
		}
		System.out.println("Sýnýf ortalamanýz :" + ortalama);
	}

}
