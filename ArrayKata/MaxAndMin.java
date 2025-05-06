import java.util.Scanner;

import java.util.Arrays;


public class MaxAndMin {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	


	System.out.print("How many numbers do you want to input: ");
	int size = input.nextInt();

	int [] minNmax = new int[size];


	for(int counter = 0; counter < minNmax.length; counter++){

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		minNmax[counter] = number;

	}


	System.out.print(Arrays.toString(ArrayKata.maximumAndMinimumOf(minNmax)));



  }
}