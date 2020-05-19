package logic;

import data.Customer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CustomersReader {

    private CustomersReader(){
    }

    public static Map<String, Customer> readCustomersDataFromFile(String fileName){
        Map<String, Customer> customerMap = new HashMap<>();
        try(
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
        ){
            String nextLine     = null;
            String id, firstName, lastName, telNumber;

            while ((nextLine = reader.readLine()) != null) {
                String [] lineValues = nextLine.split(";");
                id          = lineValues[0];
                firstName   = lineValues[1];
                lastName    = lineValues[2];
                telNumber   = lineValues[3];
                customerMap.put(id, new Customer(id,firstName,lastName,telNumber));
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return customerMap;
    }
}
