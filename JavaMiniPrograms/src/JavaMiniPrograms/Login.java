package JavaMiniPrograms;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String k_adi,parola;
			System.out.println("Kullan�c� ad� gir:");
			k_adi = scan.nextLine();
			System.out.print("Parola Gir:");
			parola = scan.nextLine();
			if(k_adi.equals("ulusan")&& parola.equals("123")) {
				System.out.println("Parola Do�rudur !");	
			}
			else {
				System.out.println("Kullan�c� ad� veya Parola yanl��!");
			}
		}
	}

}
