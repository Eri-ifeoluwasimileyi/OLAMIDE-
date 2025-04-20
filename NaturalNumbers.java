import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	
	int sum = 0;
	
	int counter = 1;

	while(counter <= 10) {
	System.out.print("Enter a number: ");
	int number = input.nextInt();

		sum = sum + number;
		
		counter = counter + 1;

	}

	System.out.print("The sum of the natural numbers are: " + sum);
	 





   }
}