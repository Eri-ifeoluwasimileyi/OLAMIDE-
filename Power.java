import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	System.out.print("Raise to power: ");  
	int number2 = input.nextInt();


	int counter = 0;
	int power = 1;

	
	while(counter < number2){
	
		power = power * number;
	
		counter = counter + 1;

	}

	System.out.print("The Answer is: " + power);










   }
}