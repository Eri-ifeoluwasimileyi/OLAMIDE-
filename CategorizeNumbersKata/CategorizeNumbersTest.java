import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CategorizeNumbersTest {


	@Test
	public void testTheCategorizeNumbers() {
	
	int[] divisible = {10, 15, 21, 30};

	int[] expected = {10, 15, 30};

	int [] returned = CategorizeNumbersKata.categorizeNumbers(divisible);
	
	assertArrayEquals(expected, returned);

	}	

}