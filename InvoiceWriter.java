import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Class to write generated Invoice to the desired output file.
 */
public class InvoiceWriter {
    /**
     * Writes a successful purchase invoice to the specified output file.
     *
     * @param fileName  the name of the output file
     * @param buyerName the name of the buyer
     * @param fruitName the name of the fruit
     * @param quantity  the quantity of the fruit purchased
     * @param unitPrice the unit price of the fruit
     * @throws IOException if an I/O error occurs while writing the invoice
     */
    public static void writeSuccess(String fileName, String buyerName, String fruitName, int quantity,
            double unitPrice) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.flush();
        bw.write("--------------:: PURCHASE SUCCESS ::--------------");
        bw.newLine();
        bw.write("Buyer's Name\t:: " + buyerName);
        bw.newLine();
        bw.write("Fruit Name\t\t:: " + StringModifier.toTitleCase(fruitName));
        bw.newLine();
        bw.write("Fruit Quantity\t:: " + quantity);
        bw.newLine();
        bw.write("Price Per Kilo\t:: $" + unitPrice);
        bw.newLine();
        bw.write("Total Price\t\t:: $" + (unitPrice * quantity));
        bw.newLine();

        bw.close();
        fw.close();
    }

    /**
     * Writes an error message to the specified output file when the desired
     * quantity is not available for purchase.
     *
     * @param fileName        the name of the output file
     * @param buyerName       the name of the buyer
     * @param fruitName       the name of the fruit
     * @param desiredQuantity the desired quantity of the fruit
     * @throws IOException if an I/O error occurs while writing the error message
     */
    public static void writeQuantityNotAvailable(String fileName, String buyerName, String fruitName,
            int desiredQuantity) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.flush();
        bw.write("--------------:: PURCHASE FAILED ::--------------");
        bw.newLine();
        bw.write("Buyer's Name\t:: " + buyerName);
        bw.newLine();
        bw.write("Fruit Name\t\t:: " + StringModifier.toTitleCase(fruitName));
        bw.newLine();
        bw.write("Desired Quantity\t:: " + desiredQuantity);
        bw.newLine();
        bw.write("ERR :: Required Quantity Not Available.");
        bw.newLine();

        bw.close();
        fw.close();
    }

    /**
     * Writes an error message to the specified output file when the desired fruit
     * is not found.
     *
     * @param fileName         the name of the output file
     * @param buyerName        the name of the buyer
     * @param desiredFruitName the name of the desired fruit
     * @throws IOException if an I/O error occurs while writing the error message
     */
    public static void writeFruitNotFound(String fileName, String buyerName, String desiredFruitName)
            throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.flush();
        bw.write("--------------:: PURCHASE FAILED ::--------------");
        bw.newLine();
        bw.write("Buyer's Name\t:: " + buyerName);
        bw.newLine();
        bw.write("Fruit Name\t\t:: " + StringModifier.toTitleCase(desiredFruitName));
        bw.newLine();
        bw.write("ERR :: Desired Fruit Not Available.");
        bw.newLine();

        bw.close();
        fw.close();
    }
}
