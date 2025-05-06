import java.util.Scanner;

public class Subtract {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	Kata newKata = new Kata();

	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();
	


	System.out.print(newKata.subtract(number1,number2));

	


}
}