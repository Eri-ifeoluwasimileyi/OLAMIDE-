import java.util.Scanner;//importing Scanner from java utility

public class Acceleration {
      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

	System.out.print("Enter Starting Velocity: ");
	float velocity0 = input.nextFloat();      
//variable type
//variable name
//used to read user input
//input is the object that was created with class Scanner
//nextDouble() is the method of the input object
//We use the . operator to invoke this method from the object called input

	System.out.print("Enter Ending Velocity: ");
	float velocity1 = input.nextFloat();

	System.out.print("Enter the time Span: ");
	float time = input.nextFloat();

	float acceleration = (velocity1 - velocity0)/time;

	System.out.print("The Average Accelaration is " + acceleration);
	//System is a class to access the system resources
	//out is an instance of printstream
	//print(); is a method of printstream

   }

}
   