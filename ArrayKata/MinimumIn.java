import java.util.Scanner;


public class MinimumIn {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	


	System.out.print("How many numbers do you want to input: ");
	int size = input.nextInt();

	int [] min = new int[size];


	for(int counter = 0; counter < min.length; counter++){

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		min[counter] = number;

	}


	System.out.print(ArrayKata.minimumIn(min));



  }
}