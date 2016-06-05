package lecture3;

import java.util.Scanner;

public class Exercise10_12 {

	public static void main(String[] args) {
		//Take in, store, and print the stored strings to the console
		Scanner Stringsscanner = new Scanner(System.in);
		int numberOfStringInputs = 10;
		String[] strings = new String[numberOfStringInputs];
		System.out.println("Please write " + strings.length + " words for me to sort accordingly!");
		for (int i = 0; i < strings.length; i++){
			strings[i] = Stringsscanner.nextLine();
		}
		Stringsscanner.close();
		//Use a sorting algorithm to sort the variables in the array.
		//Ideally the sorting algorithm should consist of another class, 
		//in which you call the algorithm from.
		//This would give you an opportunity to choose the sorting algorithm
		//or change it easily without deleting several lines of code...
		// ----------------- BubleSort -------------------------
		Boolean repeat = true; //for safety measures
		String temp; //This is the 'advanced' String. Can be used in a a.compareTo(b) function
	while(repeat){
		repeat = false;
			for(int x = 0; x < strings.length-1; x++){
					if (strings[x].compareTo(strings[x+1]) > 0){
						temp = strings[x];
						strings[x] = strings[x+1];
						strings[x+1] = temp;
						repeat = true;
				}
			}
		}
	//-------------------- BubleSort ----------------------------
		System.out.println("The first string in the array is: " + strings[0] + " and the latest is: " + strings[strings.length-1]);
		}
	}

