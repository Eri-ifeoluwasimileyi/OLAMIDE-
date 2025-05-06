import java.util.Scanner;



public class SumOf {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	


	System.out.print("How many numbers do you want to input: ");
	int size = input.nextInt();

	int [] add = new int[size];


	for(int counter = 0; counter < add.length; counter++){

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		add[counter] = number;

	}


	System.out.print(ArrayKata.sumOf(add));



  }
}