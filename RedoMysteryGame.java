import java.util.Scanner;
import java.util.Random;

public class RedoMysteryGame {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random random = new Random();

	int guessNumber = 0;
	int computerNumber = random.nextInt(10) + 1;
	int numOfGuesses = 0;

	while(guessNumber != computerNumber) {
	
	System.out.print("Enter a number between 1-10: ");
	guessNumber = input.nextInt();


	if(guessNumber < 1 || guessNumber > 10){
		System.out.println("BITCH, DON'T DO THAT. TRY AGAIN");
	}
	else 
	
	if(guessNumber > computerNumber) {
		System.out.println("Too High, TRY AGAIN");
		}
	else
	
	if(guessNumber < computerNumber) {
		System.out.println("Too Low, TRY AGAIN");
		}
	else{}
	 
	numOfGuesses = numOfGuesses + 1;
	
	}


	if(guessNumber == computerNumber) {
		System.out.println("CONGRATULATIONS, You Guessed " + numOfGuesses + " times ");
	}



   }
}