import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	Kata newKata = new Kata();


	System.out.print("Enter an interger: ");
	long number = input.nextInt();


	System.out.print(Kata.factorial(number));


}}