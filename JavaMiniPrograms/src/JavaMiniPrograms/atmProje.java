package JavaMiniPrograms;

import java.util.Scanner;

public class atmProje {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int bakiye = 1000;

		System.out.println("Bakiyeniz = " + bakiye);
		System.out.println("\n****ÝSLEMLER****\n");
		System.out.println("1. Para Çekme");
		System.out.println("2. Para Yatýrma");
		System.out.println("3. Bakiye sorgulama");
		System.out.println("4. Kart Ýade");

		System.out.print("\nÝsleminizi Seciniz: ");
		int islem = scan.nextInt();

		switch (islem) {
		case 1:
			System.out.println("Bakiyeniz = " + bakiye);
			System.out.print("Çekmek istediðiniz tutarý giriniz: " + " TL");
			int tutar = scan.nextInt();
			if (tutar > bakiye) {
				System.out.print("Yetersiz bakiye. Tekrar giriniz: ");
				tutar = scan.nextInt();
			}
			bakiye -= tutar;
			System.out.println("Yeni bakiyeniz = " + bakiye + "TL");
			break;
		case 2:
			System.out.println("Bakiyeniz = " + bakiye);
			System.out.print("Yatýrmak istediðiniz tutarý giriniz: " + "TL");
			tutar = scan.nextInt();
			bakiye += tutar;
			System.out.println("Yeni bakiyeniz = " + bakiye);
			break;
		case 3:
			System.out.println("Bakiyeniz = " + bakiye);
			break;
		case 4:
			System.out.println("Kartýnýzý almayý unutmayýnýz.!!");
		default:
			System.out.println("Yanlýs islem secitiniz. Tekrar giriniz.");
		}
	}
}