import java.util.Scanner;


public class SumOfDigit {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	SumOfDigitKata newSum = new SumOfDigitKata();


	System.out.print("Enter number: ");
	int number = input.nextInt();


	System.out.print(newSum.sumDigit(number));


}}