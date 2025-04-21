public class Patterns {
    public static void main(String[] args) {
 	
	System.out.println("Pattern A");
	for(int rows = 1; rows <= 6; rows = rows + 1) {
		for(int columns = 1; columns <= rows; columns = columns + 1) {
			System.out.print(columns + " ");
		}
		System.out.println();
	}



   }
}