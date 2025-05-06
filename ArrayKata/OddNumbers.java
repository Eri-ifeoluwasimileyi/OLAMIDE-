import java.util.Scanner;

import java.util.Arrays;


public class OddNumubers {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	ArrayKata newKata = new ArrayKata();


	System.out.print("How many numbers do you want to input: ");
	int size = input.nextInt();

	int[]odd = new int[size];


	for(int counter = 0; counter < odd.length; counter++){

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		odd[counter] = number;

	}
	


	System.out.print(Arrays.toString(newKata.oddNumbersIn(odd)));



  }
}