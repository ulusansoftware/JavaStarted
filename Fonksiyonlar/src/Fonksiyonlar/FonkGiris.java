package Fonksiyonlar;

public class FonkGiris {

	public static void main(String[] args) {
		// f(x) = ( x+2 ) * 6;
		//System.out.println("Birinci Metot");	
		//f(4);
		//System.out.println("Ýkinci Metot");
		//f(6);
		
		power (2,3);
		power (3,2);
	}
	   static void f(int x) {
	   int result = (x+2) * 6;
	   System.out.println(result);
   }
	   static void power(int number1 , int number2) {
		   int result =1;
		   for (int i =1 ; i<= number2; i++) {
			   result *= number1;
		   }
		   System.out.println("CEVAP :"+ result);
	   }
}
