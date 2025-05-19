import java.util.Arrays;

public class Categorize {
	public static void main(String[] args) {


		int [] numbers = {10, 15, 21, 30};

		CategorizeNumbersKata newCategories = new CategorizeNumbersKata();

	
		System.out.print(Arrays.toString(newCategories.categorizeNumbers(numbers)));

}}