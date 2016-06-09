package fruits;

public abstract class Fruit {

	/**
	 * Discount for fruits in general
	 */
	private static final Double FruitsDiscount = 200.0;
	private static final Integer FruitsPerDiscount = 5;
	
	public abstract Double getPrice();

	public abstract String getName();

	public boolean isThisFruit(String fruitName) {

		return (fruitName != null && fruitName.equalsIgnoreCase(getName()));
	}
	
	public abstract Double getDiscount();

	public abstract Integer getItemsPerDiscount();
	
	public Double getDiscountInCentsToApply(Integer numberOfFruits,
			Integer totalNumberOfFruits) {
		
		Double fruitDiscount = 0.0;
		
		if (getItemsPerDiscount() != null && getDiscount() != null) {
			fruitDiscount = calculateDiscount(numberOfFruits,
					getItemsPerDiscount(), getDiscount());
		}

		// Now the discount for being a fruit
		fruitDiscount += calculateDiscount(totalNumberOfFruits,
				FruitsPerDiscount, FruitsDiscount);

		return fruitDiscount;
	}
	
	/**
	 * Calculates the discount based on type of fruit, items per discount.
	 * 
	 * @param numberOfFruits
	 * @param itemsPerDiscount
	 * @param discountToApply
	 * @return
	 */
	private Double calculateDiscount(Integer numberOfFruits,
			Integer itemsPerDiscount, Double discountToApply) {
		if (numberOfFruits % itemsPerDiscount == 0) {
			return discountToApply;
		}
		return 0.0;
	}

}
