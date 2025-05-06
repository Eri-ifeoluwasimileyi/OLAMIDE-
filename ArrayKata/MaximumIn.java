import java.util.Scanner;




public class MaximumIn {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	


	System.out.print("How many numbers do you want to input: ");
	int size = input.nextInt();

	int [] max = new int[size];


	for(int counter = 0; counter < max.length; counter++){

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		max[counter] = number;

	}


	System.out.print(ArrayKata.maximumIn(max));



  }
}