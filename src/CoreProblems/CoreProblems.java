package CoreProblems;
import java.util.Scanner;
public class CoreProblems {
    // Swapping two numbers

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a number: ");  
		int number = sc.nextInt();
	    String msg =  (number % 2 == 0) ? "The number is even!" : "The number is odd!";
	    System.out.println(msg);
    }
}