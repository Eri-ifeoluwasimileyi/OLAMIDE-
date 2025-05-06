import java.util.Scanner;

import java.util.Arrays;


public class EvenNumbers {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	


	System.out.print("How many numbers do you want to input: ");
	int size = input.nextInt();

	int [] even = new int[size];


	for(int counter = 0; counter < even.length; counter++){

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		even[counter] = number;

	}


	System.out.print(Arrays.toString(ArrayKata.evenNumbersIn(even)));



  }
}