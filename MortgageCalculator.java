import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter the principal amount: ");
	double principalAnount = inputCollector.nextDouble();

	System.out.print("Enter the annual interest rate: ");
	double annualInterestRate = inputCollector.nextDouble();

	System.out.print("Enter the duration in years: ");
	double numberOfYears = inputCollector.nextDouble();

	double monthlyInterestRate = (annualInterestRate / 100) / 12;
	double numberOfMonth = numberOfYears * 12;

	double paymentCal = monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfMonth);
	
	double paymentCal2 = Math.pow((1 + monthlyInterestRate), numberOfMonth) - 1;

	double mortgagePayment = principalAmount * paymentCal / paymentCal2;

	System.out.printf("Your monthly payment is $%.2f", mortgagePayment); 
	









	













   }
}
