public class Table {
    public static void main(String[] args) {

	int counterA = 1;
	int counterB = 2;

	System.out.println("a   b    pow(a, b)");

	for(int counter = 0; counter < 5; counter = counter + 1) {
		int exponent = (int) Math.pow(counterA, counterB);
	
	
		System.out.println(counterA + "   " + counterB + "     " + exponent);

		counterA++;  

		counterB++; 
		
		}

   }
}
