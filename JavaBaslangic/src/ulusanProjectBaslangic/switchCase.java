
package ulusanProjectBaslangic;
import java.util.Scanner;

public class switchCase {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Say� giriniz :");
		int sayi = scan.nextInt();
		switch(sayi) {
		case 1 :
			System.out.println("Sayi 1 e e�ittir");
			break ;
		case 2 :
			System.out.println("Sayi 2 ye e�ittir");
			break;
		case 3 :
			System.out.println("Sayi 3 e e�ittir");
			break;
			default:
				System.out.println("Ge�ersiz say�.");
		}
		
		
	}

}
