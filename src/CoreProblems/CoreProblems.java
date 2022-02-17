package CoreProblems;
import java.util.Scanner;
public class CoreProblems {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.print(" Power of 2 problem using Java  ");
  	  System.out.print("Enter a number: ");  
  	  int num = sc.nextInt();
  	  int m = 2;
  	  int limit = m*num;
  	  System.out.println("The power table is: ");
  	  for(int p=1;p<=limit;)
  	  {
  		  if(num==0)
  		  p=1;
  		  else
  		  p=p*2;
  		  System.out.println(p);
  	 }	  
    }

}