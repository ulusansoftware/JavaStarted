package Generic;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		/*
		 ArrayList<String> a = new ArrayList<>();
		a.add("Str");
		a.add(true);
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		
		for(Integer obj : a) {
			System.out.println(obj.doubleValue());
		
			
		}
		
		HashMap <Integer,String> c = new HashMap<>();
		c.put(1, "Adana");
		c.put(6, "Ankara");
		c.put(34, "Ýstanbul");
		
		for(Integer key : c.keySet()) {
			System.out.println("Key :" + key + "- Value : " + c.get(key));
		}
		for(String value : c.values()) {
			System.out.println((value));
		*/
		
		/*Test<Integer> i = new Test<Integer>(15);
		System.out.println(i.getObj());
		
		Test<String> s = new Test<String>("Ulusan Software");
		System.out.println(s.getObj());*/
		
		/*Test2<Integer,String>i = new Test2<>(1,"Adana");
		i.print();*/
		
		Integer[] intArr = {1,2,3,4};
		Double[] doubleArr = {1.1,2.1,3.1};
		Character[] chaArr = {'K','O','D'};
		
		genericMethod(intArr);
		genericMethod(doubleArr);
		genericMethod(chaArr);
		
		}
	public static <E> void genericMethod(E[] arr) {
		for( E item : arr) {
			System.out.println(item);
		}
	}
}