import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter a number: ");
	int number = input.nextInt();


	int counter = 0;
	int answer = 1;

	
	while(counter < number) {
	
		answer = answer * (number - counter);
	
		counter = counter + 1;

	}

	System.out.print("The Answer is: " + answer);

	


   }
}