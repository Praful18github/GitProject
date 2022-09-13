package com.praful.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Shrikant");
		list.add("Hemangini");
		list.add("Pankaj");
		list.add("Praful");
		
		//using iterator
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//using foreach
		for(String s:list) {
			System.out.println(s);
		}
		
	}

}
