import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in); 

	int grade = 0;
	int counter = 1;
	int invalidcounter = 0;
	int counterA = 0;
	int counterB = 0;
	int counterC = 0;
	int counterD = 0;
	int counterF = 0;
	

	while(counter <= 10) {

	System.out.print("Enter a valid number from 0 - 100: ");
	grade = input.nextInt();

	if(grade < 0 || grade > 100) {
		System.out.println("INVALID INPUT");
		invalidcounter = invalidcounter + 1;
		
	}

	if(grade >= 0 && grade <= 100) {

		switch(grade / 10) {
		
		case 0:  System.out.println("F");
		counterF = counterF + 1;
		break;
	
		case 1:  System.out.println("F"); 
		counterF = counterF + 1;
		break;

		case 2:  System.out.println("F");
		counterF = counterF + 1;
		break; 

		case 3:  System.out.println("F");
		counterF = counterF + 1;
		break; 

		case 4:  System.out.println("F");
		counterF = counterF + 1;
		break;

		case 5:  System.out.println("D");
		counterD = counterD + 1;
		break;

		case 6:  System.out.println("C");
		counterC = counterC + 1;
		break;

		case 7:  System.out.println("B");
		counterB = counterB + 1;
		break;

		case 8:  System.out.println("A");
		counterA = counterA + 1;
		break;

		case 9:  System.out.println("A");
		counterA = counterA + 1;
		break;

		case 10:  System.out.println("A");
		counterA = counterA + 1;
		break;

		}
	
counter = counter + 1;
	}


}


System.out.println("The total number of student with grade A are:  "+ counterA);
System.out.println("The total number of student with grade B are:  "+ counterB);
System.out.println("The total number of student with grade C are:  "+ counterC);
System.out.println("The total number of student with grade D are:  "+ counterD);
System.out.println("The total number of student with grade F are:  "+ counterF);
System.out.println("The total Invalid input are:  "+ invalidcounter);






   }
}