package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> list = new ArrayList<String>();

		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");

		System.out.println(list);

		for (String num:list) {
			System.out.println(num);
		}
	;

		list.remove(1);
		list.remove(2);

		System.out.println("list after removing data:");

		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}






	

	}

}
