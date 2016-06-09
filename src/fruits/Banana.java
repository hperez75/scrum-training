package fruits;

public class Banana extends Fruit {

	private static final Double price = 1.5;
	private static final String name = "Bananas";
	private static final Double BananasDiscount = 0.0;
	private static final Integer ItemsPerDiscount = 1;

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
		return BananasDiscount;
	}

	@Override
	public Integer getItemsPerDiscount() {
		return ItemsPerDiscount;
	}

}
