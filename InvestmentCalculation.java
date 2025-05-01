  import java.util.Scanner;

public class InvestmentCalculation {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter investment amount: ");
	double investment = input.nextDouble();   //used to read user input
								//input is the object that was created with class Scanner
								//nextDouble() is the method of the input object
								//We use the . operator to invoke this method from the object called input

	System.out.print("Enter annualInterestRate: ");
	double annualInterestRate = input.nextDouble();

	System.out.print("Enter numberOfYears: ");
	double numberOfYears = input.nextDouble();
	
	double monthlyInterestRate = (annualInterestRate / 100)/12; //Change rate to decimal value using 100

	double futureInvestment = investment * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));

	System.out.printf("The future value is $%.2f", futureInvestment);
	
   }
}