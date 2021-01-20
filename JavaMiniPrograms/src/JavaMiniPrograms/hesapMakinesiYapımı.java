package JavaMiniPrograms;

import java.util.Scanner;

public class hesapMakinesiYapýmý {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int number1, number2, choose;
			System.out.print("Enter the first number =>");
			number1 = scan.nextInt();
			System.out.print("Enter the second number =>");
			number2 = scan.nextInt();
			System.out.println("\n Please select the action you want to do ;");
			System.out.println("\n1-> Addition\n2-> subtraction\n3-> Multiplication\n4-> Division");
			System.out.print("\nYour choose :");
			choose = scan.nextInt();

			if (choose == 1) {
				System.out.println("RESULT OF ADDITION : " + (number1 + number2));
			}
			if (choose == 2) {
				System.out.println("RESULT OF SUBRACTION :" + (number1 - number2));
			}
			if (choose == 3) {
				System.out.println("RESULT OF MULTIPLACITION : " + (number2 * number1));
			
			}
			if (choose == 4) {
				System.out.println("RESULT OF DIVISION :" + (number1 / number2));

			}
		}
	}

}
				