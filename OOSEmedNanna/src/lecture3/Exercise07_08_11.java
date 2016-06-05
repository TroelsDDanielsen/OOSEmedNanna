package lecture3;
import java.util.Scanner;
public class Exercise07_08_11 {
public static void main(String[] args){
	//Take in, store, and print the stored doubles to the console
	Scanner doublesscanner = new Scanner(System.in);
	int numberOfDoubleInputs = 10;
	double[] doubles = new double[numberOfDoubleInputs];
	System.out.println("Please write " + doubles.length + " doubles for me to output the smallest from!");
	for (int i = 0; i < doubles.length; i++){
		doubles[i] = doublesscanner.nextDouble();
	}
	doublesscanner.close();
	//Use a sorting algorithm to sort the variables in the array.
	//Ideally the sorting algorithm should consist of another class, 
	//in which you call the algorithm from.
	//This would give you an opportunity to choose the sorting algorithm
	//or change it easily without deleting several lines of code...
	// ----------------- BubleSort -------------------------
	Boolean repeat = true; //for safety measures
	Double temp; //This is the 'advanced' Double. Can be used in a a.compareTo(b) function
while(repeat){
	repeat = false;
		for(int x = 0; x < doubles.length-1; x++){
				if (doubles[x] > doubles[x+1]){
					temp = doubles[x];
					doubles[x] = doubles[x+1];
					doubles[x+1] = temp;
					repeat = true;
			}
		}
	}
//-------------------- BubleSort ----------------------------
	System.out.println("The smallest Double in the array is: " + doubles[0] + " and the largest is: " + doubles[doubles.length-1]);
	}
}

