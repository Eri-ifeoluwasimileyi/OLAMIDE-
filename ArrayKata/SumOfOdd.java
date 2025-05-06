import java.util.Scanner;



public class SumOfOdd {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	


	System.out.print("How many numbers do you want to input: ");
	int size = input.nextInt();

	int [] sumodd = new int[size];


	for(int counter = 0; counter < sumodd.length; counter++){

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		sumodd[counter] = number;

	}


	System.out.print(ArrayKata.sumOfOddNumbersIn(sumodd));



  }
}