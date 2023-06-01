# Command Line Application : Fruit Seller

This Java terminal application is designed to serve as a menu-driven fruit seller application. It allows users to input their name, select fruits to buy, specify the quantity, and generates invoices for the purchases made.

## Features

- User-friendly menu-driven interface.
- Input customer name, fruit name, and quantity to buy.
- Generates invoices for each purchase.
- Calculates total price based on quantity and price per kilo.
- Supports multiple fruit options.
- Allows users to continue shopping or exit the application.

## Prerequisites

- Java Development Kit (JDK) 8 or higher

## Usage

1. Clone or download the project source code from the repository.

2. Compile the Java source code to generate the executable class files:

```shell
javac FruitSeller.java
java FruitSeller
```
3. Follow the on-screen instructions to input the customer details, select fruits, and specify the quantity to purchase. The application will read data from `FruitList.csv` file and after you close the application, it will write final changes to the same.

4. The application will generate an invoice for each purchase, displaying the customer name, fruit name, quantity, price per kilo, and the total price. One invoice will be printed in the terminal for the user, another will be written inside `Sales.txt` for business uses.

5. After each purchase, the user will be prompted to continue shopping or exit the application. Write `yes` to continue, and `no` to exit.

## Contributions

Contributions are welcome! If you have any suggestions, bug reports, or feature requests, please open an issue or submit a pull request to this repository.

## License

This project is licensed under the MIT License.