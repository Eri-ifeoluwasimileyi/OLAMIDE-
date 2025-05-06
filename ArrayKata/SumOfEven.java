import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	


	System.out.print("How many numbers do you want to input: ");
	int size = input.nextInt();

	int [] sumeven = new int[size];


	for(int counter = 0; counter < sumeven.length; counter++){

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		sumeven[counter] = number;

	}


	System.out.print(ArrayKata.sumOfEvenNumbersIn(sumeven));



  }
}