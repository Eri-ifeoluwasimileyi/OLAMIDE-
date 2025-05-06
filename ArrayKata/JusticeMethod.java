import java.util.Arrays;


public class JusticeMethod {
    public static void main(String[] args) {
	
	ArrayKata newKata = new ArrayKata();

	
	int [] numbers = {22,  51,  38,  23,  48};
	int [] myEven = newKata.evenNumbersIn(numbers);
	

	for (int each : myEven) {
		System.out.print(each + ",");

	}	



	System.out.print(Arrays.toString(newKata.evenNumbersIn(numbers)));



  }
}