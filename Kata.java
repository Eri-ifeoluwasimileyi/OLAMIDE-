public class Kata {

	public boolean nextBoolean(int number) {

		boolean even = number % 2 == 0;

		return even;
		
	}

	public static int subtract(int number1, int number2) { 
		
		int difference = number1 - number2;
		
		return Math.abs(difference);
	

	}


	public static float divide(float number1, float number2) {
		
		
		float quotient;
		
		if(number2 == 0) {
			quotient = 0;
		} else

		quotient = number1 / number2;
		
		return quotient;

	}

	public static int factors(int number) {
		
    	   		 int counter = 1;
    	  		 int counterFactor = 1;
	
		while(counterFactor <= number) {
			 
			counterFactor++; 

      	    		  if (number % counterFactor == 0) {
       			    counter ++;        		
             		  }
            
      		}
       		 return counter;	
	

	}




	public static boolean palindrome(int number) {

		int remNumber = 0;
		int reversedNumber = 0;
		int firstNumber = number;



		while(number != 0) {
	
			remNumber = number % 10; 
			reversedNumber = reversedNumber * 10 + remNumber; 
			number = number / 10; 


		}	

	return firstNumber == reversedNumber;



	}



	public static long factorial(long number) {
	
		long counter = 0;
		long answer = 1;

	
		while(counter < number) {
	
			answer = answer * (number - counter);
			
			counter++;

		}
	return answer;
		
	}



	

	public static long square(long number) {

		long value = number * number;

	return value;

	}












}