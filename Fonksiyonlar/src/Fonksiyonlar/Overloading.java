package Fonksiyonlar;

public class Overloading {

	static int add(int a, int b) {
		System.out.print("1.Metot :");
		return a+b ;
	}
	static int add(int a,int b,int c) {
		System.out.print("2.Metot :");
		return a+b+c;
	}
	static double add(int a,int b, double c) {
		System.out.print("3.Metot :");
		return a+b+c;
	}
	static double add(int a,double b, int c) {
		System.out.print("4.Metot :");
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(add( 1,2));
		System.out.println(add( 1,2,5));
		System.out.println(add( 1,2,7.0));
		System.out.println(add( 1,2.0,9));
	}

}
