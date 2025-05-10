
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	Kata newKata = new Kata();

	System.out.print("Enter an integer: ");
	int number = input.nextInt();

	System.out.print(newKata.primeNumber(number));

	


}
}
