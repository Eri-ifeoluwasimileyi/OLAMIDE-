public class CategorizeNumbersKata {

	public static int [] categorizeNumbers(int [] numbers) {
		
		int multipleCounter = 0;
		int [] result = new int [3];

		for(int counter = 0; counter < numbers.length; counter++) {
		
			if(numbers[counter] % 5 == 0) {
				
				result[multipleCounter] = numbers[counter];
				multipleCounter++;
			}

		}
		

		if(multipleCounter == 0) System.out.print("No divisible numbers found");
			
	
		
	return result;
	
				
	}

}				