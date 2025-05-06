import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	Kata newKata = new Kata();

	System.out.print("Enter first integer: ");
	int number = input.nextInt();


	System.out.print(newKata.factors(number));

	
}
}