package ulusanProjectBaslangic;

public class Operatorler {

	private static int toplam;
	private static int c�karma;

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		setC�karma(a - b);
		toplam(a + b);
		//System.out.println("Modalma:"+ mod );
		//System.out.println("C�karma: " + c�karma );
		//System.out.println("Toplama: " + toplam );
		//System.out.println("Carpma: " + carp�m );
		//System.out.println("Bolme: " + bolum );
        toplam(toplam() + 1);
        //System.out.println(toplam);
        setC�karma(getC�karma() - 1);
        //System.out.println(c�karma);
        
        //System.out.println(sonuc);
        //System.out.println(a);
        //System.out.println(b);
        
        int sayi1 = 10;
        int sayi2 = 5;
        int sayi3 = 25;
        
        boolean kosul = (sayi1 / sayi2) == 2 ;
        System.out.println(kosul);
        
        boolean kosul1 =(sayi1 > sayi2 );
        boolean kosul2 =(sayi2 < sayi1 );
        
        boolean sonuc2 = kosul1 && kosul2;
        System.out.println(sonuc2);
        
        sonuc2 = kosul1 || kosul2 ;
        System.out.println(sonuc2);
        
        String sonuc3 = (a==b) ? "Do�ru" : "Yanl��" ;
        System.out.println(sonuc3);
        
        sayi1 = sayi2 ;
        System.out.println(sayi1);
        sayi1 = sayi1 + 2;
        System.out.println(sayi1);
        sayi3 = sayi2 + 4;
        System.out.println(sayi3);
        
        
        
        
	}

	public static int getC�karma() {
		return c�karma;
	}

	public static void setC�karma(int c�karma) {
		Operatorler.c�karma = c�karma;
	}

	public static int toplam() {
		return toplam;
	}

	public static void toplam(int toplam) {
		Operatorler.toplam = toplam;
	}

}
