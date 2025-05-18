public class SumOfDigitKata {

	

	public static int sumDigit(int number){
    
 	
		int digit = 0;
		int sum = 0;

		if(number < 1 || number > 10000){
			System.out.print("Invalid input, Try again!");
		} 
		if (number > 1 && number < 10000){

		while(number != 0) {
	
			digit = number % 10;
			number = number / 10;

			sum = sum + digit;

		}

		

		}

		return sum;
	}

}
	



