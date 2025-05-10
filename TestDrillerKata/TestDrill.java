import java.util.Scanner;


public class TestDrill {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	TestDrillerKata newDrillKata = new TestDrillerKata();


	System.out.print("Enter number of copies: ");
	int number = input.nextInt();


	System.out.print(newDrillKata.testDriller(number));


}}