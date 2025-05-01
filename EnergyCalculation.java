import java.util.Scanner;

public class EnergyCalculation {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter water in Kilograms: ");
	double water = input.nextDouble();

	System.out.print("Enter initial Temperature: ");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter Final Temperature: ");
	double finalTemperature = input.nextDouble();

	double energy = water * (finalTemperature - initialTemperature) * 4184;

	System.out.printf("The Energy Needed is %.1f", energy);

   }

}