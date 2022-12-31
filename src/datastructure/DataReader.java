package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "\\src\\data\\self-driving-car.txt";

		//print text from file
		try {
			FileReader fr = new FileReader(textFile);
			BufferedReader br =new BufferedReader(fr);

			String text;
			while((text=br.readLine())!=null){
				System.out.println(text);
			}
			fr.close();
			br.close();
		}catch(Exception e){
			System.out.println(e);
		}

		//store words from file in DataBase
		try {
			FileReader fr = new FileReader(textFile);
			BufferedReader br =new BufferedReader(fr);

			//connectToSqlDB
			ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

			String text;
			text =br.readLine();
			String [] words=text.split("[.,!-- ]+");

			connectToSqlDB.createSqlTableForStringArray("selfDrivingCar","words");


			while(text!=null){
				for(int i=0;i<words.length;i++) {
					if(!text.isEmpty()) {
						connectToSqlDB.insertDataFromStringToSqlTable(words[i],"selfDrivingCar","words");
					}
				}
				text=br.readLine();
				if(text!=null)
					words=text.split("[.,!-- ]+");
			}

			fr.close();
			br.close();
		}catch(Exception e){
			System.out.println(e);
		}

		//retrieve data from database
		try {
			List<String> aList= new ArrayList<String>();
			LinkedList<String> lList= new LinkedList<String>();
			Stack<String> sList= new Stack<String>();
			ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

			aList = connectToSqlDB.readDataBase("selfDrivingCar", "words");

			//place data into linked list and stack
			for (String s:aList) {
				lList.add(s);
				sList.push(s);
			}

			//print stack
			System.out.println("These are the words from the stack (FILO):\n---------------------------------------");
			while(!sList.empty()){
				System.out.println(sList.pop());
			}

			//print linked list
			System.out.println("These are the words from the linked list (FIFO):\n-----------------------------------------------");
			Iterator it = lList.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}

		}catch(Exception e){
			System.out.println(e);
		}
		/*
		Stack<String> stck= new Stack<String>();
		LinkedList<String> lList = new LinkedList<String>();
		stck.add(words[i]);
		lList.add(words[i]);
		*/




	}

}
