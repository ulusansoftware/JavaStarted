package JavaMiniPrograms;

import java.util.Scanner;

public class DaireAlanVeHacimHesaplama {

	public static void main(String[] args) {
		int r ;
		double alan , hacim , pi=3.14;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Daire yar��ap�n� giriniz:\n" );
			r = input.nextInt();
		}
		alan = 2 * pi * r ;
		hacim = pi *( r*r );
		System.out.println("Dairenin alan� : " + alan);
		System.out.println("Dairenin hacmi : " + hacim);
		
		
	}

}
