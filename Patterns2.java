public class Patterns2 {
    public static void main(String[] args) {
 	
	System.out.println("Pattern B");
	for(int rows = 6; rows >= 1; rows = rows - 1) {
		for(int columns = 1; columns <= rows; columns = columns + 1) {
			System.out.print(columns + " ");
		}
		System.out.println();
	}



   }
}