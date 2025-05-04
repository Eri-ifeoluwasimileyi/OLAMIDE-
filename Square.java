import java.util.Scanner;

public class Square {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	Kata newKata = new Kata();

	System.out.print("Enter first integer: ");
	long number = input.nextInt();


	System.out.print(Kata.square(number));


   }
}