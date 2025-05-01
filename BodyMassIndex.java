import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter weight in pounds: ");
	double weightInPounds = input.nextDouble();

	System.out.print("Enter height in inches: ");
	double heightInInches = input.nextDouble();

	double weightInKilograms = 0.45359237 * weightInPounds;
	double heightInMeters = 0.0254 * heightInInches;

	double BMI = weightInKilograms/(heightInMeters * heightInMeters);

	System.out.printf("The BodyMassIndex is %.4f " , BMI);

   }

}	