package com.yapikredi.training.collentions.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMain {
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		
		// Liste sýralý ekle
		strList.add("osman1");
		strList.add("osman2");
		
		// Listeden index ile alma
		String string1 = strList.get(0);
		String string2 = strList.get(1);
		
		// Listeyi index ile güncelleme
		strList.add(0, "osman4");
		
		String string3 = strList.get(0);
		
		// Liste silme
		strList.clear();
		
		// Liste arama
		boolean contains = strList.contains("osman1");
		
		// Listeyi sýralý dönme
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		// Listeyi sýralý dönme
		for (String xyz : strList) {
			System.out.println(xyz);
		}
		
		// Sýralama
		Collections.sort(strList);
		
		
		
	}
	
}
