import java.util.HashMap;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Utility class for generating and writing stock details of fruits.
 */
public class StockDetails {
    /**
     * Generates a HashMap of fruit details from a CSV file.
     *
     * @return a HashMap with fruit names as keys and FruitDetails objects as values
     * @throws IOException           if an I/O error occurs while reading the CSV
     *                               file
     * @throws FileNotFoundException if the CSV file is not found
     */
    public static HashMap<String, FruitDetails> generate() throws IOException, FileNotFoundException {
        HashMap<String, FruitDetails> fruitIndexMap = new HashMap<String, FruitDetails>();
        FileReader fr = new FileReader("FruitList.csv");
        BufferedReader br = new BufferedReader(fr);

        // first line contains the headings of the columns, here we discard the line
        br.readLine();

        String line = "";

        // populate hashmap to store fruit data
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.equals("")) {
                continue;
            }

            // generate individual strings seperated by comma
            final String[] words = line.split(",");

            final String name = words[0].trim();
            final Integer quantity = Integer.parseInt(words[1].trim());
            final Double pricePerKilo = Double.parseDouble(words[2].trim());

            fruitIndexMap.put(name, new FruitDetails(name, quantity, pricePerKilo));
        }

        br.close();
        fr.close();

        return fruitIndexMap;
    }

    /**
     * Writes the stock details of fruits to a CSV file.
     *
     * @param fruitIndexMap a HashMap with fruit names as keys and FruitDetails
     *                      objects as values
     * @throws IOException if an I/O error occurs while writing the CSV file
     */
    public static void write(HashMap<String, FruitDetails> fruitIndexMap) throws IOException {
        FileWriter fw = new FileWriter("FruitList.csv");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("name,quantity,pricePerKilo");
        bw.newLine();

        for (String fruitName : fruitIndexMap.keySet()) {
            FruitDetails details = fruitIndexMap.get(fruitName);
            String outputString = String.format("%s,%d,%.2f", fruitName, details.getFruitQuantity(),
                    details.getPricePerKilo());
            bw.write(outputString);
            bw.newLine();
        }

        bw.close();
        fw.close();
    }
}
