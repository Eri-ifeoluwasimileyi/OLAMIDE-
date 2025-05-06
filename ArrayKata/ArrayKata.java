public class ArrayKata {


	public static int maximumIn(int [] numbers) {

		int largestNumber = -2000000;

		for(int counter = 0; counter < numbers.length; counter++){

			
			if(numbers[counter] > largestNumber){
			
				largestNumber = numbers[counter];	
			}
		}

	return largestNumber;

	}



	public static int minimumIn(int [] numbers) {

		int smallestNumber = 2345769;

		for(int counter = 0; counter < numbers.length; counter++) {


			if(numbers[counter] < smallestNumber) {
				
				smallestNumber = numbers[counter];

			} 
		}

	return smallestNumber;

	}


	
	public static int sumOf(int [] numbers) {

		int sum = 0;

		for(int counter = 0; counter < numbers.length; counter++) {
			
			sum = sum + numbers[counter];					
			
		}
	return sum;
	}


	
	public static int sumOfEvenNumbersIn(int [] numbers) {

		int evenSum = 0;

		for(int counter = 0; counter < numbers.length; counter++) {

			if(numbers[counter] % 2 == 0) {

			evenSum = evenSum + numbers[counter];

			}
		}
	return evenSum;
	
	}



	public static int sumOfOddNumbersIn(int [] numbers) {
		
		int oddSum = 0;

		for(int counter = 0; counter < numbers.length; counter++) {

			if(numbers[counter] % 2 != 0) {
			
			oddSum = oddSum + numbers[counter];

			}
		}
	return oddSum;

	}



	public static int[] maximumAndMinimumOf(int [] numbers) {
		
		int max = -2000000;

		int min = 23456790;

		for(int counter = 0; counter < numbers.length; counter++){

			
			if(max < numbers[counter]) max = numbers[counter];

			if(min > numbers[counter]) min = numbers[counter];
		}

	int [] maxAndmin = new int [2]; 

	maxAndmin[0] = max;

	maxAndmin[1] = min;

		
	return maxAndmin;
	}



	 public static int noOfOddNumbersIn(int [] numbers) {
		
		int oddNumberCounter = 0;

		for(int counter = 0; counter < numbers.length; counter++) {

			if(numbers[counter] % 2 != 0) {
					
				oddNumberCounter++;
			}
		}

	return oddNumberCounter;

	}



	public static int noOfEvenNumbersIn(int [] numbers) {

		int evenNumberCounter = 0;

		for(int counter = 0; counter < numbers.length; counter++) {

			if(numbers[counter] % 2 == 0) {
			
				evenNumberCounter++;
			}
		}

	return evenNumberCounter;

	}



	public static int [] evenNumbersIn(int [] numbers) {

		int evenNumCounter = 0;

		for(int counter = 0; counter < numbers.length; counter++) {

			if(numbers[counter] % 2 == 0) evenNumCounter++;

		}

		int [] numOfEvens = new int [evenNumCounter];




		int count = 0;


		for(int counter = 0; counter < numbers.length; counter++) {

			if(numbers[counter] % 2 == 0) {
	
				numOfEvens[count] = numbers[counter];
			
				count++;	
			}

		}
	return numOfEvens;

		

	}




	public static int [] oddNumbersIn(int [] numbers) {

		int oddNumCounter = 0; //to count the numbers of odd numbers in the array 

		for(int counter = 0; counter < numbers.length; counter++){
			
			if(numbers[counter] % 2 != 0) oddNumCounter++; 
			//if the numbers[counter] divided byb 2 is equal to zero, the the odd counter counts it
		}
	
		int [] numOfOdds = new int [oddNumCounter];
		 //putting the numbers of odd number in the array inside the num off odd so that it bcan know the num of od number is in the array
			
			int count = 0; //another counter to go through the index

			for(int counter = 0; counter < numbers.length; counter++){
			
				if(numbers[counter] % 2 != 0) {
					
					numOfOdds[count] = numbers[counter];

					count++;
				}
			}
	return numOfOdds;	


	}
	



	public static int [] squareNumbersIn(int [] numbers) {

		int square = 0;

		int [] squaredNumbers = new int [numbers.length];

		for(int counter = 0; counter < numbers.length; counter++) {
			
			square = numbers[counter] * numbers[counter];

			squaredNumbers[counter] = square;		
			
		}
	return squaredNumbers;


	}
	
	
		

		











}