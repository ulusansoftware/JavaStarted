package NesneYönelimliProg;

public class SýnýflarArasýIiskiler {

	public static void main(String[] args) {
		// SINIFLAR ARASI ILISKILER
		// -- Baðýmlýlýk ( Dependency ) "uses a " A USES B
		// -- Birleþtirme ( composition ) "has a " 
		// -- Kalýtým (inheritance) " is a "
			A a = new A();
			B b = new B();
			a.b = b;
			
	}

}
