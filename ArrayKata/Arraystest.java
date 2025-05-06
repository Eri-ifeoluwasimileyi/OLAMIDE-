import java.util.Arrays;


public class Arraystest {
    public static void main(String[] args) {
	
	ArrayKata newKata = new ArrayKata();

	
	int [] numbers = {22,  51,  38,  23,  48};
		
	String result = Arrays.toString(newKata.maximumAndMinimumOf(numbers));


	System.out.print(result);


  }

}