import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter the balance: ");
	double balance = input.nextDouble();

	System.out.print("Enter interest rate: ");
	double interestRate = input.nextDouble();


	double interest = balance * (interestRate/1200);

	System.out.printf("The Interest is %.5f", interest);

   }

}