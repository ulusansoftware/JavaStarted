package ulusanProjectBaslangic;

import java.util.Scanner;

public class buyuktenKucugeSýralama {

	public static void main(String[] args) {
		// a > b > c veya a > c > b
		// b > a > c veya b > c > a
		// c > a > b veya c > b > a
		int a, b, c;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Lütfen Sayýlarý Giriniz :");
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
		}
		if (a > b && a > c) {
			if (b > c) {
				System.out.println("a>b>c");
			} else {
				System.out.println("a>c>b");
			}
		} else if (b > a && b > c) {
			if (a > c) {
				System.out.println("b>a>c");
			} else {
				System.out.println("b>c>a");
			}
		} else {
			if (a > b) {
				System.out.println("c>a>b");
			} else {
				System.out.println("c>b>a");
			}
		}
	}
}
