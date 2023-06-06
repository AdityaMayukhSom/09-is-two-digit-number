/**
 * Class to write generated Invoice in the terminal
 */
public class InvoicePrinter {
    /**
     * Prints a successful purchase invoice.
     *
     * @param buyerName the name of the buyer
     * @param fruitName the name of the fruit
     * @param quantity  the quantity of the fruit purchased
     * @param unitPrice the unit price of the fruit
     */
    public static void printSuccess(String buyerName, String fruitName, int quantity,
            double unitPrice) {
        System.out.println("--------------:: PURCHASE SUCCESS ::--------------");
        System.out.println("Buyer's Name\t:: " + buyerName);
        System.out.println("Fruit Name\t:: " + StringModifier.toTitleCase(fruitName));
        System.out.println("Fruit Quantity\t:: " + quantity + "Kg");
        System.out.println("Price Per Kg\t:: $" + unitPrice);
        System.out.println("Total Price\t:: $" + (unitPrice * quantity));
    }

    /**
     * Prints an error message for a purchase with an unavailable quantity.
     */
    public static void printQuantityNotAvailable() {
        System.out.println("***** Desired Quantity Not Available *****");
        System.out.println("-----------:: PURCHASE FAILED ::-----------");
    }

    /**
     * Prints an error message for a purchase of a fruit that is not found.
     */
    public static void printFruitNotFound() {
        System.out.println("***** Desired Fruit Not Available *****");
        System.out.println("----------:: PURCHASE FAILED ::----------");
    }
}
