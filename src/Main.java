import logic.CustomersOperator;
import logic.CustomersReader;

public class Main {
    public static void main(String[] args) {
        CustomersOperator.runMenu(CustomersReader.readCustomersDataFromFile("data.csv"));
    }
}
