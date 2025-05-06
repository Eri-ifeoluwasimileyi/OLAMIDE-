import java.util.Scanner;

public class Divison {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	Kata newKata = new Kata();

	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();
	


	System.out.print(newKata.divide(number1,number2));