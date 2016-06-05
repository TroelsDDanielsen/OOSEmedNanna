package lecture3;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		//Take in, store, and print the stored doubles to the console
		Scanner doublesscanner = new Scanner(System.in);
		int numberOfDoubleInputs = 10;
		double sum = 0;
		double[] doubles = new double[numberOfDoubleInputs];
		System.out.println("Please write " + doubles.length + " doubles for me to calculate the mean from!");
		for (int i = 0; i < doubles.length; i++){
			doubles[i] = doublesscanner.nextDouble();
		}
		doublesscanner.close();
		for (int i = 0; i < doubles.length; i++){
			sum +=doubles[i];
		}
		System.out.println("The sum of the " + doubles.length + " doubles are: " + sum + " and the mean of them are: " + (sum/doubles.length));
	}

}
