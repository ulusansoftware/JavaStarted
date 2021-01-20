package Fonksiyonlar;

public class Student {
	public String name;
	public int id, point;
	private static int counter = 0;

	Student(String name, int id, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
		Student.counter++;

	}

	public void exit() {
		Student.counter--;
	}

	public static int howStudent() {
		return Student.counter;
	}

	public static double calcOverall(int[] arr) {
		double overall = 0;
		for (int i = 0; i < arr.length; i++) {
			overall += arr[i];

		}
		return overall / arr.length;
	}
}
