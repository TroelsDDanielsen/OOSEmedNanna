package lecture3;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] array = new int[2];
		System.out.println("Inds�t venligst nogle arrays tak!");
		array[0] = scan.nextInt();
		array[1] = scan.nextInt();
		if (array[0] < array[1]){
			System.out.println(array[1] + " er st�rst!");
		}
		else {
			System.out.println(array[0] + " er st�rst!");
			}
		scan.close();
	}

}
