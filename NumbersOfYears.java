import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter number of minutes: ");
	int minutes = input.nextInt();

	int minutesInADay = 60 * 24;
	int numbersOfDays = minutes / minutesInADay;
	int numbersOfYears = numbersOfDays / 365;
	int remaindersDays = numbersOfDays % 365;

	System.out.printf("%d minutes is approximately %d years and %d days", minutes, numbersOfYears, remaindersDays);

   }

}