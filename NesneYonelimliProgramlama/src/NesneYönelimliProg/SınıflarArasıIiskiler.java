package NesneY�nelimliProg;

public class S�n�flarAras�Iiskiler {

	public static void main(String[] args) {
		// SINIFLAR ARASI ILISKILER
		// -- Ba��ml�l�k ( Dependency ) "uses a " A USES B
		// -- Birle�tirme ( composition ) "has a " 
		// -- Kal�t�m (inheritance) " is a "
			A a = new A();
			B b = new B();
			a.b = b;
			
	}

}
