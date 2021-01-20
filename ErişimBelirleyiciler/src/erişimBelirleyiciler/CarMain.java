package eriþimBelirleyiciler;

public class CarMain {

	public static void main(String[] args) {
		// public = BÜTÜN SINIFLAR ERÝÞEBÝLÝR.
		// private = ALT-SINIF DAHÝL BAÞKA HÝÇ BÝR SINIF ERÝÞEMEZ!!
		// protected = ALT-SINIFLAR VE AYNI PAKETTEKÝLER ERÝÞEBÝLÝR.
		// <default> (ön-tanýmlý) (VOID) = AYNI PAKETTEKÝLER ERÝÞEBÝLÝR.
		
		Car car = new Car();
		car.run();
	}

}
