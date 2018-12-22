import java.util.Scanner;

public class CheckingYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("\n ****Checking if given year is Leap Year  or not *****");
		System.out.println(" ||  ------------------------------------------------||");
		System.out.print ("   Enter  Year (Only Year) :");
		int year=input.nextInt();
		
		
		if( year % 400==0 || (year % 4==0 && year % 100 !=0)) // This time  using if statement to check  but we can make boolean method to check leap year as well
		{
			System.out.println("It  is a Leap year !");
		}
		else 
		{
			System.out.println("It  is not  a Leap year !");
		}
		input.close();

	}

}
