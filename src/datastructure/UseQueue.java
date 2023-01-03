package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.List;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */


		//put data in Queue
		PriorityQueue<String> boroughs = new PriorityQueue<String>();
		boroughs.add("Manhattan");
		boroughs.add("Bronx");
		boroughs.add("Queens");
		boroughs.add("Long Island");
		boroughs.add("Brooklyn");


		System.out.println(boroughs);

		Iterator<String> it = boroughs.iterator();


		while (it.hasNext()) {
			System.out.println(boroughs.peek());


			boroughs.remove();
		}
		
		System.out.println(boroughs);

	}
}