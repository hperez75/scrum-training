package fruits;

public class Cherry extends Fruit {

	private static final Double price = 0.75;
	private static final String name = "Cherries";
	private static final Double CherriesDiscount = 20.0;
	private static final Integer ItemsPerDiscount = 2;

	@Override
	public Double getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public Double getDiscount() {
		return CherriesDiscount;
	}

	@Override
	public Integer getItemsPerDiscount() {
		return ItemsPerDiscount;
	}
}
