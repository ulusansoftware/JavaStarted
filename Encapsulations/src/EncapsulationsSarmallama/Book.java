package EncapsulationsSarmallama;

public class Book {
	private String name, author, publisher;
	private int numberOfPage;

	Book(String name, int numberOfPage , String author, String publisher) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		if (numberOfPage < 1) {
			this.numberOfPage = 10;
		} else {
			this.numberOfPage = numberOfPage;
		}
	}

	public int getnumberOfPage() {
		return this.numberOfPage;
	}

	public void setNumberOfPage(int size) {
		if (size < 1) {
			System.out.println("Sayfa Sayýsý Negatif Olamaz !");
			this.numberOfPage = 10;
		} else {
			this.numberOfPage = size;
		}
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}