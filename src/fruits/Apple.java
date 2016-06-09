package fruits;

public class Apple extends Fruit {

	double price = 1.0;
	String name = "Apples";
	private static final Double ApplesDiscount = 0.0;
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
		return ApplesDiscount;
	}

	@Override
	public Integer getItemsPerDiscount() {
		return ItemsPerDiscount;
	}
	
}
