import java.util.Scanner;



public class NumberOfEven {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	


	System.out.print("How many numbers do you want to input: ");
	int size = input.nextInt();

	int [] numeven = new int[size];


	for(int counter = 0; counter < numeven.length; counter++){

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		numeven[counter] = number;

	}


	System.out.print(ArrayKata.noOfEvenNumbersIn(numeven));



  }
}