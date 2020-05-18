package logic;

import data.Customer;
import java.util.Map;
import java.util.Scanner;

public abstract class CustomersOperator {
    public static void runMenu(Map<String, Customer> CustomersData) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println("-------------------------"); // screen separator
            System.out.println("Podaj ID klienta (0. Wyjście):");
            String userInput = scanner.nextLine();
            userInput = userInput.toUpperCase();
            if (userInput.equals("0")) {
                loop = false;
                return;
            }
            if (CustomersData.containsKey(userInput)) {
                //pobierz i wyswietl dane o kraju
                System.out.println(CustomersData.get(userInput));
            } else {
                System.out.println("Klient o podanym ID nie istnieje w bazie danych: " + userInput);
            }
        } while (loop);
    }
}
