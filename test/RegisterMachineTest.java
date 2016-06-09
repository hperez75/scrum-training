import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RegisterMachineTest {

	@Test
	public void testEcho() {

		RegisterMachine regM = new RegisterMachine();
		String input = "anything";
		assertEquals("Simple test", input,regM.execute(input));
	}

}
