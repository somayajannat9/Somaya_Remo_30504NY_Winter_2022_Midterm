package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";


		try {
			FileReader fr = new FileReader(textFile);
			BufferedReader br = new BufferedReader(fr);

			String text;
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		//store in DataBase
		try {
			FileReader fr = new FileReader(textFile);
			BufferedReader br = new BufferedReader(fr);


			ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

			String text;
			text = br.readLine();
			String[] words = text.split("[.,!-- ]+");

			connectToSqlDB.createSqlTableForStringArray("selfDrivingCar", "words");


			while (text != null) {
				for (int i = 0; i < words.length; i++) {
					if (!text.isEmpty()) {
						connectToSqlDB.insertDataFromStringToSqlTable(words[i], "selfDrivingCar", "words");
					}
				}
				text = br.readLine();
				if (text != null)
					words = text.split("[.,!-- ]+");
			}

			fr.close();
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		//retrieve from database
		try {
			List<String> aList = new ArrayList<String>();
			LinkedList<String> lList = new LinkedList<String>();
			Stack<String> sList = new Stack<String>();
			ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

			aList = connectToSqlDB.readDataBase("selfDrivingCar", "words");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
