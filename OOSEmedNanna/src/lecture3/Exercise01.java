package lecture3;
import java.util.*;

public class Exercise01 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write your name!");
		String name = sc.nextLine();
		System.out.println("Hello " + name + "!" );
		sc.close();
	}
}
