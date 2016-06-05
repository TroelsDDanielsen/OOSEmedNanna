package lecture3;
import java.util.*;
public class Exercise05 {
	public static void main(String[] args){
		String[] words = new String[2];
		System.out.println("Input two words for me to sort alphabetically");
		Scanner fuckmywords = new Scanner (System.in);
		words[0] = fuckmywords.next();
		words[1] = fuckmywords.next();
		if (words[0].compareTo(words[1]) < 0){
			System.out.println("\'"+words[0] + "\'" + " comes earlier in the dictionary!");
		}
		else if (words[0].compareTo(words[1]) > 0){
			System.out.println("\'"+words[1] + "\'" + " comes earlier in the dictionary!");
		}
		else if (words[0].compareTo(words[1]) == 0){
			System.out.print("\'"+words[0] + "\'" + " and " + "\'"+words[1]+ "\'" + " are spelled equally!");
		}
		else {
			System.out.println("An error have occured. Please try again");
		}
		fuckmywords.close();
	}
}
//Ekstra opgave mulig:
//Lav en function der tager flere end ti inputs og 