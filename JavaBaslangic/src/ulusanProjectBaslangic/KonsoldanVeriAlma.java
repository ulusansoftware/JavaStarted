package ulusanProjectBaslangic;

import java.util.Scanner;

public class KonsoldanVeriAlma {

	private static int a;
	private static int b;

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			System.out.println("A say�n� Giriniz :");
			a = input.nextInt();
			System.out.println("B say�s�n� Giriniz :");
			b = input.nextInt();
			System.out.println("A say�s�  :" + a);
			System.out.println("B say�s� :" + b);

			double c;
			System.out.println("Double t�r�nde say� giriniz : ");
			c = input.nextDouble();
			System.out.println(c);

			String str;
			str = input.nextLine();
			System.out.println(str);
		}

	}

	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		KonsoldanVeriAlma.a = a;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		KonsoldanVeriAlma.b = b;
	}

}
