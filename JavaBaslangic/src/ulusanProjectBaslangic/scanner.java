package ulusanProjectBaslangic;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		int bakiye =1000, input;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome To The Ulusan Bank !!");
		System.out.println("G�ncel Bakiyeniz: " + bakiye + " TL ");
		
		while (bakiye > 0) {
			System.out.println();
			System.out.println("1-) Para Yat�r.");
			System.out.println("2-) Para �ek.");
			System.out.println("3-) Bakiye Sorgula.");
			System.out.println("4-) ��k�� Yap");
			System.out.print("Yapmak �stedi�iniz ��lemi Se�iniz :");
			input =scan.nextInt();
		}
		
		System.out.println("TEKRAR BEKLER�Z !");
		
	}

}
