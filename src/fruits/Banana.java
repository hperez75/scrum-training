package fruits;

public class Banana extends Fruit {

	private static final Double price = 1.5;
	private static final String name = "Bananas";

	@Override
	public Double getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

}
