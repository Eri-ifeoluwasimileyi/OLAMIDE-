public class ArrayClasswork {

	public static void main(String[] args) {

		
		char [] [] plays = new char [3] [3];
		 
		plays [0] [0] = 'X';
		plays [0] [1] = 'O';
		plays [0] [2] = 'X';

		plays [1] [0] = 'O';
		plays [1] [1] = 'O';
		plays [1] [2] = 'O';

		plays [2] [0] = 'X';
		plays [2] [1] = 'X';
		plays [2] [2] = 'O';
			
	

		for(int counter = 0; counter < plays.length; counter++) {
	

			for(int counter1 = 0; counter1 < 3; counter1++){


				System.out.print(plays[counter][counter1] + " ");
 
			}

			System.out.println();

		}


   }
}