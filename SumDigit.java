import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();
 	
	int digit = 0;
	int sum = 0;

	if(number < 1 || number > 10000){
		System.out.print("Invalid input, Try again!");
	} 
	if (number > 1 && number < 10000){

	while(number != 0) {
	
		digit = number % 10;
		number = number / 10;

		sum = sum + digit;

	}

	System.out.printf("The sum of the digit is: " + sum); 

}

	
  }

}