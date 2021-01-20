package Collections;

import java.util.*;

public class Mapler {

	public static void main(String[] args) {
		// - clear() Map i�inde bulunan b�t�n de�erleri siler..
		// - get(Object key) Anahtara kar��l�k gelen objeyi d�nd�r�r.
		// - put(Object key , Object Value ) : Anahtar | De�er ikilisini kay�t eder.
		/////////////////////////////////////////////////////////
		// HashMap
		// HashMap D�ZENS�Z �IKARIR say�lara valuelere g�re
		/*
		HashMap b = new HashMap();
		b.put("T�rkiye", "Ankara");
		b.put("�ngiltere", "Londra");
		b.put("Fransa", "Paris");
		Set s = b.entrySet();
		Iterator i = s.iterator();

		while (i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + "=> " + item.getValue());
		*/
		
		///////////////////////////////////////////////////////////
		//LinkedHashMap   SIRAYLA �IKARIR
		/*
		LinkedHashMap ogr = new LinkedHashMap();
		ogr.put("Ali", 90);
		ogr.put("Veli", 80);
		ogr.put("Ahmet", 75);
		
		Set set = ogr.entrySet();
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + " => "+ item.getValue());
		*/	
		//////////////////////////////////////////////////////	 
		//TreeMap
		//TreeMap ilk de�ere g�re ��kar�r valueleri k���kten b�y��e do�ru
		TreeMap<Integer,String> ogr = new TreeMap();
		ogr.put(10, "Ali");
		ogr.put(5, "Veli");
		ogr.put(6, "Ahmet");
		
		Set set = ogr.entrySet();
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + " => "+ item.getValue());
			 
		}
		
		}
	}


