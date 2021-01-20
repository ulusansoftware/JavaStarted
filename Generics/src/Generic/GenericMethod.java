package Generic;

public class GenericMethod {
	
	public<E> void genericMethod(E[] arr) {
		for( E item : arr) {
			System.out.println(item);
		}
	}
}
