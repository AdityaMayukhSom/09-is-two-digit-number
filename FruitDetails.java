/**
 * Represents details of a fruit, including its name, quantity, and price per
 * kilo.
 */
class FruitDetails {
    private String fruitName;
    private Integer fruitQuantity;
    private Double pricePerKilo;

    /**
     * Constructs a new instance of FruitDetails with the specified parameters.
     *
     * @param fruitName     the name of the fruit
     * @param fruitQuantity the quantity of the fruit
     * @param pricePerKilo  the price per kilo of the fruit
     */

    public FruitDetails(final String fruitName, final Integer fruitQuantity, final Double pricePerKilo) {
        this.fruitName = fruitName;
        this.fruitQuantity = fruitQuantity;
        this.pricePerKilo = pricePerKilo;
    }

    /**
     * Returns a string representation of the FruitDetails object.
     *
     * @return a string representation of the FruitDetails object
     */
    @Override
    public String toString() {
        return "FruitDetails [fruitName = " + fruitName + ", fruitQuantity = " + fruitQuantity + ", pricePerKilo = "
                + pricePerKilo + "]";
    }

    /**
     * Returns the name of the fruit.
     *
     * @return the name of the fruit
     */
    public String getFruitName() {
        return fruitName;
    }

    /**
     * Sets the name of the fruit.
     *
     * @param fruitName the name of the fruit
     */
    public void setFruitName(final String fruitName) {
        this.fruitName = fruitName;
    }

    /**
     * Returns the quantity of the fruit.
     *
     * @return the quantity of the fruit
     */
    public Integer getFruitQuantity() {
        return fruitQuantity;
    }

    /**
     * Sets the quantity of the fruit.
     *
     * @param fruitQuantity the quantity of the fruit
     */
    public void setFruitQuantity(final Integer fruitQuantity) {
        this.fruitQuantity = fruitQuantity;
    }

    /**
     * Returns the price per kilo of the fruit.
     *
     * @return the price per kilo of the fruit
     */
    public Double getPricePerKilo() {
        return pricePerKilo;
    }

    /**
     * Sets the price per kilo of the fruit.
     *
     * @param pricePerKilo the price per kilo of the fruit
     */
    public void setPricePerKilo(final Double pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }
}