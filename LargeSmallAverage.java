import java.util.Scanner;

public class LargeSmallAverage {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");	
    	int number1 = input.nextInt();

    	System.out.print("Enter second integer: ");
    	int number2 = input.nextInt();

   	System.out.print("Enter third integer: ");
   	int number3 = input.nextInt();

   	System.out.print("Enter fourth integer: ");
   	int number4 = input.nextInt();

	System.out.print("Enter fifth integer: ");
    	int number5 = input.nextInt();

	if(number1 >= number2 && number1 >= number3 && number1 >= number4 && number1 >= number5) {
	System.out.println(number1 + " is the largest number");
	}
	else 
	if(number2 >= number1 && number2 >= number3 && number2 >= number4 && number2 >= number5) {
	System.out.println(number2 + " is the largest number");
	}
	else
	if(number3 >= number1 && number3 >= number2 && number3 >= number4 && number3 >= number5){
	System.out.println(number3 + " is the largest number");
	}
	else
	if(number4 >= number1 && number4 >= number2 && number4 >= number3 && number4 >= number5){
	System.out.println(number4 + " is the largest number");
	}
	else
	if(number5 >= number1 && number5 >= number2 && number5 >= number3 && number5 >= number4){
	System.out.println(number5 + " is the largest number");
	}
	else {
	System.out.print("Invalid input");
	}
	
	if(number1 <= number2 && number1 <= number3 && number1 <= number4 && number1 <= number5){
	System.out.println(number1 + " is the smallest number");
	}
	else
	if(number2 <= number1 && number2 <= number3 && number2 <= number4 && number2 <= number5){
	System.out.println(number2 + " is the smallest number");
	}
	else
	if(number3 <= number1 && number3 <= number2 && number3 <= number4 && number3 <= number5){
	System.out.println(number3 + " is the smallest number");
	}
	else
	if(number4 <= number1 && number4 <= number2 && number4 <= number3 && number4 <= number5){
	System.out.println(number4 + " is the smallest number");
	}
	else
	if(number5 <= number1 && number5 <= number2 && number5 <= number3 && number5 <= number4){
	System.out.println(number5 + " is the smallest number");
	}
	else {
	System.out.println("Invalid Input");
	}
	
	int evenSum = 0;
	int evenSumCounter = 0;

	if(number1 % 2 == 0){
	   evenSum = evenSum + number1;
	}
	if(number2 % 2 == 0){
	   evenSum = evenSum + number2;
	}
	if(number3 % 2 == 0){
	   evenSum = evenSum + number3;
	}
	if(number4 % 2 == 0){
	   evenSum = evenSum + number4;
	}
	if(number5 % 2 == 0){
	   evenSum = evenSum + number5;
	}
	

	if(number1 % 2 == 0){
	   evenSumCounter = evenSumCounter + 1;
	}
	if(number2 % 2 == 0){
	   evenSumCounter = evenSumCounter + 1;
	}
	if(number3 % 2 == 0){
	   evenSumCounter = evenSumCounter + 1;
	}
	if(number4 % 2 == 0){
	   evenSumCounter = evenSumCounter + 1;
	}
	if(number5 % 2 == 0){
	   evenSumCounter = evenSumCounter + 1;
	}
	


	System.out.print("The average of the even number is " + evenSum / evenSumCounter);
	



   }
}