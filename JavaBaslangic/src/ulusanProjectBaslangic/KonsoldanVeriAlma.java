package ulusanProjectBaslangic;

import java.util.Scanner;

public class KonsoldanVeriAlma {

	private static int a;
	private static int b;

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			System.out.println("A sayýný Giriniz :");
			a = input.nextInt();
			System.out.println("B sayýsýný Giriniz :");
			b = input.nextInt();
			System.out.println("A sayýsý  :" + a);
			System.out.println("B sayýsý :" + b);

			double c;
			System.out.println("Double türünde sayý giriniz : ");
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
