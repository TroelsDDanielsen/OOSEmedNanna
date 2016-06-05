package lecture3;
import java.util.Scanner;
public class Exercise06 {
	public static void main(String[] args){
	System.out.println("Please write 10 integers for me to output in reverse order!");
	Scanner tenfuckedupintegersscanner = new Scanner(System.in);
	int[] tenfuckedupintegers = new int[10];
	for(int i = 0; i < 10; i++){
		tenfuckedupintegers[i] = tenfuckedupintegersscanner.nextInt();
	}
	tenfuckedupintegersscanner.close();
	System.out.println("The 10 integers are:");
	for(int j = 0; j < 10; j++){
		System.out.print(tenfuckedupintegers[j] + " ");
	}
	System.out.println("\nThe 10 reversed integers are:");
	for(int z = 9; z >= 0; z--){
		System.out.print(tenfuckedupintegers[z] + " ");
	}
	
	}
}
