package ulusanProjectBaslangic;

import java.util.Scanner;

public class AsalSayýlar {

	public static void main(String[] args) {
		// Asal sayýlarý bulma

		Scanner scan = new Scanner(System.in);
		int input;
		boolean asal =true;
		 
		do {
			System.out.print("Lütfen pozitif sayý giriniz :");
			input = scan.nextInt();
		} while (input < 2);
		for(int i=2; i < input; i++) {
			if (input%i==0) {
				asal = false;
				break;
			}
		}
		if(asal) {
			System.out.print("\nGirilen sayý:" + input +" \nAsaldýr.");
			
		}else {
			System.out.print("\nGirilen sayý  : " + input + "\nAsal deðildir.");
		}
	}

}
