package Fonksiyonlar;

import java.util.Scanner;

public class ArrayDiziler {
	public static void main(String[] args) {
		int value = 7;
		// Dizi olu�turulur. Dizimizin boyutu 3 yani 3 de�i�ken tutabilen bir yap�
		// tan�mlam�� olduk.
		int[] values;
		values = new int[3];
		System.out.println(values[0]);
		// Dizi elemanlar�na de�er atama yap�l�r.
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		// D�ng� yard�m�yla diziye ait t�m de�erler ekrana yazd�r�l�r.
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		int[] numbers = { 5, 6, 7 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}