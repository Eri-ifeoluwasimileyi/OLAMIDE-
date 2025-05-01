import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter takeoff Speed: ");
	double speed = input.nextDouble();

	System.out.print("Enter Airplane Acceleration: ");
	double acceleration = input.nextDouble();

	double length = (speed * speed)/ (2 * acceleration);

	System.out.printf("The minimum runway length is %.3f", length);
	

   }

}