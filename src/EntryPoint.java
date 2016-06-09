import java.util.Scanner;

public class EntryPoint {
	private Scanner scanner;
	private InputReader inputReader;
	private OutputWriter outputWriter;
	private RegisterMachine registerMachine;

	/**
	 * Default constructor.
	 */
	public EntryPoint() {
		init();
	}

	/**
	 * Main method.
	 */
	public void execute() {
		while (true) {
			String line = inputReader.readInput();
			if (line.equalsIgnoreCase("end")) {
				break;
			}

			String resultLine = registerMachine.execute(line);
			outputWriter.writeInput(resultLine);

		}

		scanner.close();
	}

	/**
	 * Some init tasks: create pertinent instances.
	 */
	private void init() {
		scanner = new Scanner(System.in);
		registerMachine = new RegisterMachine();
		inputReader = new InputReader(scanner);
		outputWriter = new OutputWriter();
	}

	public static void main(String[] args) {
		EntryPoint command = new EntryPoint();
		command.execute();
	}

}
