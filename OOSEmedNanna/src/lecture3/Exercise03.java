package lecture3;
import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] array = new int[2];
		System.out.println("Indsæt venligst nogle arrays tak!");
		array[0] = scan.nextInt();
		array[1] = scan.nextInt();
		if (array[0] > array[1]){
			System.out.println(array[1] + " er mindst!");
		}
		else {System.out.println(array[0] + " er mindst!");
			}
		scan.close();
	}
}
