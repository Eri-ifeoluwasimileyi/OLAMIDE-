import java.util.Scanner;

public class LargeSmall {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	int largestNumber = number;
	int smallestNumber = number;
	int choice;

	for(choice = 1; choice == 1;) {
		System.out.print("Enter 1 to enter another number or 0 to stop: ");
		choice = input.nextInt();
	
		if(choice == 1) {
			System.out.print("Enter a number: ");
			number = input.nextInt();


			if(number < smallestNumber) {
				smallestNumber = number;
			}

			if(number > largestNumber) {
				largestNumber = number;
			}
	
	   	 }
	}

	System.out.println("The smallest number is: " + smallestNumber);
	System.out.println("The largest number is: " + largestNumber);
	

   }
}	