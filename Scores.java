public class Scores {

	public static void main(String[] args) {


		int [] numbers = {22,  51,  38,  23,  48};
 	
		for(int counter = 0; counter < numbers.length; counter++) {

			System.out.print(numbers[counter] + " ");
		}
			
	System.out.println() ;

	System.out.println();

		int sum = 0;

		for(int counter = 0; counter < 5; counter++) {

			System.out.println(numbers[counter] + " ");
			
			sum = sum + numbers[counter];						
			
		}
	
		System.out.println("The sum of the numbers are: " + sum);
	
		




  }
}