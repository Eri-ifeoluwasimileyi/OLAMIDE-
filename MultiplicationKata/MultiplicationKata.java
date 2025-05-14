public class MultiplicationKata {
	
	public static void multiplication(int a, int b) {

	for(int counter = a; counter <= b; counter++) {
		System.out.printf("%4d", counter);
	}
	System.out.println();


	System.out.print("    ");
	for(int counter = a; counter <= b; counter++) {
		System.out.print("----");
	}
	System.out.println("-");


	for(int counter = a; counter <= b; counter++) {
		System.out.printf("%2d |", counter);
		for(int count = a; count <= b; count++) {
			System.out.printf("%4d", counter * count);
		}
		System.out.println();
	}

	

}

}


