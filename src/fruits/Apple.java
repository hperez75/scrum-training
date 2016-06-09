package fruits;

public class Apple extends Fruit {

	double price = 1.0;
	String name = "Apples";
	
	@Override
	public Double getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}
	
}
