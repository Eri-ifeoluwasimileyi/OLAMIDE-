import java.util.Scanner;

public class FactorOfNumbers {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	System.out.println("The factors of " + number + " are: ");
	int counter = 1;

	while(counter <= number) {
		
		if(number % counter == 0){
			
			System.out.println(counter);
			
		}
		counter = counter + 1;		
	}
			
   }
}