import java.util.Scanner;

public class FeetsToMeters {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter value for Feet: ");
	double valueForFeet = input.nextDouble();

	double valueForMeters = 0.305 * valueForFeet;
	
	System.out.printf("The value in Meters is %.4f", valueForMeters);

   }

}