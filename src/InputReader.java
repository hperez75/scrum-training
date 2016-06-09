import java.util.Scanner;

public class InputReader {

	private Scanner scanner;
	/**
	 * Default constructor.
	 */
	public InputReader(Scanner inputScanner) {
		scanner = inputScanner;
	}
	
	public String readInput() {
		System.out.print("\nEnter product: ");
		return scanner.next();
	}

}
