package datastructure;

import java.awt.image.ImageProducer;
import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		Map<String, List<String>> list = new HashMap<String,List<String>>();
		ArrayList<String> brooklyn = new ArrayList<String>();

		brooklyn.add("Bushwick");
		brooklyn.add("BedStuy");
		brooklyn.add("Brownsville");
		brooklyn.add("East New York");

		list.put("Brooklyn",brooklyn);

		System.out.println(list);
		System.out.println(list.get("Brooklyn"));


	}

}
