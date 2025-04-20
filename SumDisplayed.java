import java.util.Scanner;

public class SumDisplayed {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	
	int userChoice;

	do {
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();

		System.out.print("Enter second number: ");
		int  number2 = input.nextInt();

		int sum = number1 + number2;
		System.out.println("The sum is: " + sum);


		System.out.print("Enter 1 to perform the operation again or enter 0 to exit: ");
		userChoice = input.nextInt();

	} while(userChoice ==1);
	
	System.out.println("Program has been terminated! ");

		






   }
}