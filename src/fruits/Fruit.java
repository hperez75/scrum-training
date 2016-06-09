package fruits;

public abstract class Fruit {

	public abstract Double getPrice();

	public abstract String getName();

	public boolean isThisFruit(String fruitName) {

		return (fruitName != null && fruitName.equalsIgnoreCase(getName()));
	}

}
