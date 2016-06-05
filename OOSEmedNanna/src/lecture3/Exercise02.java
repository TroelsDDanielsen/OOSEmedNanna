package lecture3;
import java.util.*;

public class Exercise02 {
	public static void main(String Args[]){
	Scanner myepicscanner = new Scanner(System.in);
	double[] myepicdoubles = new double[2];
	System.out.println("Please write two doubles for me to use");
	myepicdoubles[0] = myepicscanner.nextDouble();
	myepicdoubles[1] = myepicscanner.nextDouble();
	System.out.println("There are " + myepicdoubles.length + " doubles in the array and they are: " + myepicdoubles[0] + " and " + myepicdoubles[1]);
	System.out.println("The sum of the two doubles are: " + (myepicdoubles[0] + myepicdoubles[1]));
	myepicscanner.close();
	
	}
}
