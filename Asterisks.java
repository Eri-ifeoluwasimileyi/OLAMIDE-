public class Asterisks {
    public static void main(String[] args) {
 	
	System.out.println("(a)");
	
	for(int rows = 1; rows <= 10; rows = rows + 1) {
		for(int columns = 1; columns <= rows; columns = columns + 1) {
			System.out.print("*");
		}
		System.out.println();	
	}
	System.out.println();




	System.out.println("(b)");

	for(int rows = 10; rows >= 1; rows = rows - 1) {
		for(int columns = 1; columns <= rows; columns = columns + 1) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();





	System.out.println("(c)");
	
	for(int rows = 10; rows >= 1; rows = rows - 1) {
		for(int columns = 1; columns <= 10 - rows; columns = columns + 1) {
			System.out.print(' ');
		}
		for(int columns = 1; columns <= rows; columns = columns + 1) {
			System.out.print("*");
		}
		System.out.println();
	}





	System.out.println("(d)");
	
	for(int rows = 1; rows <= 10; rows = rows + 1) {
		for(int columns = 1; columns <= 10 - rows; columns = columns + 1) {
			System.out.print(' ');
		}
		for(int columns = 1; columns <= rows; columns = columns + 1) {
			System.out.print("*");
		}
		System.out.println();
	}

	System.out.println();



   }
}