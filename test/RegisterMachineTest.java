import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class RegisterMachineTest {

	private List<String> fruits;
	private List<Integer> acummulatedTotal;
	
	@Before
	public void setUp() {
		// Map with the fruits and the consolidated total
		fruits = Arrays.asList("Apples", "Cherries", "Cherries");
		acummulatedTotal = Arrays.asList(100, 175, 230);
	}
	
	/**
	 * Test done for iteration 0: simple echo function.
	 */
	@Test
	public void testEcho() {

		RegisterMachine regM = new RegisterMachine();
		String input = "anything";
		String output = "anything 0";
		assertEquals("Echo test fails", output,regM.execute(input));
	}
	
	/**
	 * Test updated for iteration 2: test registration and addition of several fruits applying cherries discount.
	 */
	@Test
	public void testPurchaseFruitsAndApplyCherriesDiscount() {
		RegisterMachine regM = new RegisterMachine();
		for (int i = 0; i < fruits.size(); i++) {
			regM.execute(fruits.get(i));
			assertEquals("Error purchasing more than one fruit",
					acummulatedTotal.get(i), regM.getTotal());
		}
	}

}
