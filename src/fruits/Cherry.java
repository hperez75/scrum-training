package fruits;

public class Cherry extends Fruit {

	private static final Double price = 0.75;
	private static final String name = "Cherries";

	@Override
	public Double getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}
}
