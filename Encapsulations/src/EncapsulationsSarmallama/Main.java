package EncapsulationsSarmallama;

public class Main {

	public static void main(String[] args) {
		// Encapsulation ( Sarmallama , Kaps�lleme )
		// Inheritance (Kal�t�m)
		// Polymorphism ( �ok Bi�imlilik)
		// Abstraction (Soyutlama)
			
		Book b1 = new Book("Harry Potter" , 100 ,"Rowling", "ULUSAN");
		b1.setNumberOfPage(200);
		System.out.println(b1.getnumberOfPage());
		
		Book b2 = new Book("Lord OF THE" , 500, "Peter Jackson","Emre");
		b2.setName("LORD OF THE RINGS");
		System.out.println(b2.getName());
		
		Book b3 = new Book("asd", 400, "EMRE YUN","ASLAN");
		b3.setName("EMRE YUNUS");
		System.out.println(b3.getName());
		
		Book b4 = new Book("asdfg" , 99,"Yusuf Sezai","I�IL");
		b4.setName("I�ILSU");
		System.out.println(b4.getName());
		
		
	}

}


