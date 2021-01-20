package ulusanProjectBaslangic;

public class whýleAndDoWhýleKullanýmý {

	public static void main(String[] args) {
		int i = 1 ;
		System.out.println("\n Döngü Baþladý!");
		/*
		while (i<=5) {
			System.out.print(i + ",");
			i++;	
		}*/
		do {
			System.out.println(i+",");
			i++;
		}while (i<=5);
		System.out.println("\n Döngü Bitti!");
		
	}

}
