package ulusanProjectBaslangic;

import java.util.Scanner;

public class AsalSay�lar {

	public static void main(String[] args) {
		// Asal say�lar� bulma

		Scanner scan = new Scanner(System.in);
		int input;
		boolean asal =true;
		 
		do {
			System.out.print("L�tfen pozitif say� giriniz :");
			input = scan.nextInt();
		} while (input < 2);
		for(int i=2; i < input; i++) {
			if (input%i==0) {
				asal = false;
				break;
			}
		}
		if(asal) {
			System.out.print("\nGirilen say�:" + input +" \nAsald�r.");
			
		}else {
			System.out.print("\nGirilen say�  : " + input + "\nAsal de�ildir.");
		}
	}

}
