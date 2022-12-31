package datastructure;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		//put data in Queue
		PriorityQueue<String> names= new PriorityQueue<String>();
		names.add("Carlos");
		names.add("Brian");
		names.add("Greg");
		names.add("Jose");
		names.add("David");

		//print the queue
		System.out.println(names);

		Iterator<String> it = names.iterator();

		//use iterator to print one item at a time
		while(it.hasNext()){
			System.out.println(names.peek());

			//remove current head
			names.remove();
		}

		//print empty queue
		System.out.println(names);

	}

}
