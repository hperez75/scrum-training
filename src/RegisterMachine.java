import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fruits.Apple;
import fruits.Banana;
import fruits.Cherry;
import fruits.Fruit;

public class RegisterMachine {

	private List<Fruit> fruits;
	private Map<String, Integer> counterFruitsPerType;
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
		counterFruitsPerType = new HashMap<String, Integer>();
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
				
				updateFruitCounter(fruit);

				// apply the discount
				total -= fruit.getDiscountInCentsToApply(
						counterFruitsPerType.get(fruit.getName()),
						getAccummulatedNumberOfFruits());
			}
		
		}
	}
	
	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return total.intValue();
	}
	
	/**
	 * Total number of fruits so far..
	 * 
	 * @return
	 */
	private Integer getAccummulatedNumberOfFruits() {
		int count = 0;
		for (Integer fruitsPerType : counterFruitsPerType.values()) {
			count += fruitsPerType;
		}
		return count;
	}
	
	/**
	 * Updates the counter for the different fruits.
	 * 
	 * @param inputFruit
	 */
	private void updateFruitCounter(Fruit inputFruit) {
		String fruitName = inputFruit.getName();
		if (!counterFruitsPerType.containsKey(fruitName)) {
			counterFruitsPerType.put(fruitName, 0);
		}

		counterFruitsPerType.put(fruitName,
				counterFruitsPerType.get(fruitName) + 1);

	}

}
