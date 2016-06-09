import java.util.ArrayList;
import java.util.List;

import fruits.Apple;
import fruits.Banana;
import fruits.Cherry;
import fruits.Fruit;

public class RegisterMachine {

	private List<Fruit> fruits;
	private Double total;
	
	/**
	 * Default constructor.
	 */
	public RegisterMachine() {
		init();
	}

	/**
	 * Some initial tasks.
	 */
	private void init() {
		createFruits();
		total = 0.0;
	}
	
	/**
	 * Create the list of market fruits.
	 */
	private void createFruits() {
		fruits = new ArrayList<Fruit>();
		fruits.add(new Apple());
		fruits.add(new Banana());
		fruits.add(new Cherry());
	}

	/**
	 * Main method, where everything happens.
	 * 
	 * @param inputString
	 * @return
	 */
	public String execute(String inputString) {

		addPrice(inputString);
		return inputString + " " + getTotal();
	}
	
	/**
	 * Adds the price to get the total.
	 * 
	 * @param inputString
	 */
	private void addPrice(String inputString) {
		for (Fruit fruit : fruits) {
			if (fruit.isThisFruit(inputString)) {
				total += fruit.getPrice() * 100;
			}
		}
	}
	
	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return total.intValue();
	}

}
