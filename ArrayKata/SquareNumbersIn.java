import java.util.Scanner;

import java.util.Arrays;


public class SquareNumbersIn {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("How many numbers do you want to input: ");
	int size = input.nextInt();

	int [] squared = new int[size];


	for(int counter = 0; counter < squared.length; counter++){

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		squared[counter] = number;

	}


	System.out.print(Arrays.toString(ArrayKata.squareNumbersIn(squared)));



  }
}