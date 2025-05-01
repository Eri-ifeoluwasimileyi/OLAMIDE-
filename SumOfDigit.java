import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();
 	
	int digit1 = 0;
	int digit2 = 0;
	int digit3 = 0;
	int remainder = 0;


	if(number <= 0 || number >= 1000){
	System.out.print("Don't print");
	} 
	if(number > 0 && number < 1000){
	
	digit1 = number % 10;
	remainder = number / 10;

	digit2 = remainder % 10;
	remainder = remainder / 10;

 	digit3 = remainder % 10;
	remainder = remainder / 10;

	int sum = digit1 + digit2 + digit3;

	System.out.printf("The sum of the digits in %d is %d", number, sum); 
	}
  }

}