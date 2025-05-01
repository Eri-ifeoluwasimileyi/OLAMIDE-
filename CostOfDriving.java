import java.util.Scanner;

public class CostOfDrivng {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
 
	System.out.print("Enter Driving Distance: ");
 	double drivingDistance = input.nextDouble();

	System.out.print("Enter Fuel Used Per Mile: ");
	double fuelEfficiency = input.nextDouble();

	System.out.print("Enter Price per Gallon: ");
	double priceOfGallon =  input.nextDouble();
	
	double costOfDriving = (drivingDistance * priceOfGallon)/fuelEfficiency;
      //distance * price per gallon / fuel used per mile

	System.out.printf("The Cost of Driving is $%.2f", costOfDriving);

   }

}