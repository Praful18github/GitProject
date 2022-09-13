package com.praful.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> primeNumb=new LinkedList<Integer>();
		primeNumb.add(2);
		primeNumb.add(3);
		primeNumb.add(5);
		primeNumb.add(7);
		
		//using listiterator
		ListIterator<Integer> itr = primeNumb.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//using foreach
		for(Integer a:primeNumb) {
			System.out.println(a);
		}
	}

}
