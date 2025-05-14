import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	MultiplicationKata newMulti = new MultiplicationKata();

	System.out.print("Enter first integer: ");
	int a = input.nextInt();

	System.out.print("Enter second integer: ");
	int b = input.nextInt();
	


	newMulti.multiplication(a, b);

	


}
}