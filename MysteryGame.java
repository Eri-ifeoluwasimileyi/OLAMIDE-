import java.util.Scanner;
import java.util.Random;

public class MysteryGame {
    public static void main(String... args) {
	
	Scanner collector = new Scanner(System.in);
	Random random = new Random();

	System.out.println("Enter a number between 0-10: ");
	int guessNumber = collector.nextInt();
	int computerNumber = random.nextInt(11);


	if(guessNumber < 0 || guessNumber > 10){
		System.out.println("CAN'T TAKE THAT SHIT!!");
		}
	else
	if(guessNumber == computerNumber) {
		System.out.println("You Won, Princess!!!");
		}
	else
	if(guessNumber > computerNumber){
		System.out.println("Too High, Try Again");

		


		System.out.println("Enter a number between 0-10: ");
		guessNumber = collector.nextInt();

		if(guessNumber < 0 || guessNumber > 10){
		System.out.println("CAN'T TAKE THAT SHIT");
		}
		else
		if(guessNumber == computerNumber) {
		System.out.println("You Won, Princess!!!");
		}
		else
		if(guessNumber > computerNumber){
		System.out.println("Too High, Try Again");

			

			System.out.println("Enter a number between 0-10: ");
			guessNumber = collector.nextInt();

			if(guessNumber < 0 || guessNumber > 10){
			System.out.println("CAN'T TAKE THAT SHIT");
			}
			else
			if(guessNumber == computerNumber) {
			System.out.println("You Won, Princess!!!");
			}
			else
			if(guessNumber > computerNumber){
			System.out.println("You Lose Lad");
			}
			else
			if(guessNumber < computerNumber) {
			System.out.println("You Lose Lad");
			}
			else{}

			
		}
		else
		if(guessNumber < computerNumber) {
		System.out.println("Too Low, Try Again");


			System.out.println("Enter a number between 0-10: ");
			guessNumber = collector.nextInt();

			if(guessNumber < 0 || guessNumber > 10){
			System.out.println("CAN'T TAKE THAT SHIT");
			}
			else
			if(guessNumber == computerNumber) {
			System.out.println("You Won, Princess!!!");
			}
			else
			if(guessNumber > computerNumber){
			System.out.println("You Lose Lad");
			}
			else
			if(guessNumber < computerNumber) {
			System.out.println("You Lose Lad");
			}
			else{}


		}
		else{}





		}
	else
	if(guessNumber < computerNumber) {
		System.out.println("Too Low, Try Again");




		System.out.println("Enter a number between 0-10: ");
		guessNumber = collector.nextInt();

		if(guessNumber < 0 || guessNumber > 10){
		System.out.println("CAN'T TAKE THAT SHIT");
		}
		else
		if(guessNumber == computerNumber) {
		System.out.println("You Won, Princess!!!");
		}
		else
		if(guessNumber > computerNumber){
		System.out.println("Too High, Try Again");

			System.out.println("Enter a number between 0-10: ");
			guessNumber = collector.nextInt();

			if(guessNumber < 0 || guessNumber > 10){
			System.out.println("CAN'T TAKE THAT SHIT");
			}
			else
			if(guessNumber == computerNumber) {
			System.out.println("You Won, Princess!!!");
			}
			else
			if(guessNumber > computerNumber){
			System.out.println("You Lose Lad");
			}
			else
			if(guessNumber < computerNumber) {
			System.out.println("You Lose Lad");
			}
			else{}



		}
		else
		if(guessNumber < computerNumber) {
		System.out.println("Too Low, Try Again");


			System.out.println("Enter a number between 0-10: ");
			guessNumber = collector.nextInt();

			if(guessNumber < 0 || guessNumber > 10){
			System.out.println("CAN'T TAKE THAT SHIT");
			}
			else
			if(guessNumber == computerNumber) {
			System.out.println("You Won, Princess!!!");
			}
			else
			if(guessNumber > computerNumber){
			System.out.println(" You Lose Lad");
			}
			else
			if(guessNumber < computerNumber) {
			System.out.println("You Lose Lad");
			}
			else{}



		}
		else{}





		}
	else{}


	
	

	
























   }
} 