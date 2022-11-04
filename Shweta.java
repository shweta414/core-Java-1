/*
write a program to create online food order system
 */
import java.util.Scanner;
public class Shweta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		food();
	}
	public static void food()
	{
	System.out.println("Welcome to anudeep hotel");
	int choice;
	char ans;
	Scanner sc=new Scanner(System.in);
	int Choice;
	do
	   Choice= sc.nextInt();
	    String runningTotal;
		int foodItem;
		switch(choice){
	      case 1:
	        foodItem = 1;
	        runningTotal += itemPrice(foodItem);
	        break;
	      case 2:
	        foodItem = 2;
	        runningTotal += itemPrice(foodItem);
	        break;
	      case 3:
	        foodItem = 3;
	        runningTotal += itemPrice(foodItem);
	        break;
	      case 4:
	        done(runningTotal);
	        break;
	      default:
	System.out.println("Do you want to continue this process y/n");
	ans=sc.next().charAt(0);
	}
	while(ans=='y' ||ans=='Y');

	System.out.println("Thanks for coming :)");
	
	boolean ordering;
	while(ordering);
	  System.out.println("Total amount: " + runningTotal);

	}


}


