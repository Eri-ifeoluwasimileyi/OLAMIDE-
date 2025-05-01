import java.util.Scanner;

public class PoundsToKilos {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter number in pounds: ");
	double weightInPounds = input.nextDouble();

	double weightInKilos = 0.454 * weightInPounds;
	
	System.out.printf("The weight in Kilograms is %.3f", weightInKilos);


   }
}