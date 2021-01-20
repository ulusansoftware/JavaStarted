package Fonksiyonlar;

public class MultidimensionalArrayCokBoyutluDiziler {

	public static void main(String[] args) {
		// Çok boyutlu diziler
		// int[] 1Darr = new int[5]
		int[][] tablo = new int[][] { { 1, 75, 10 }, { 2, 87, 13 }, { 73, 95, 15 }, { 4, 103, 18 }, { 5, 110, 19 } };

		int[][] tablo2 = new int[5][3];

		tablo2[0][0] = 1;
		tablo2[0][1] = 75;
		tablo2[0][2] = 10;

		for (int i = 0; i < tablo.length; i++) {
			for (int j = 0; j < tablo[0].length; j++) {
				System.out.print(tablo[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------");

		for (int[] sutun : tablo) {
			for (int value : sutun) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

}
