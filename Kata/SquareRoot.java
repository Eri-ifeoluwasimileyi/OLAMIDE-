import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	Kata newKata = new Kata();

	System.out.print("Enter an integer: ");
	double number = input.nextDouble();

	System.out.print(newKata.squareRoot(number));

	


}
}