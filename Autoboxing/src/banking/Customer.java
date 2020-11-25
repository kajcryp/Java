package banking;

import java.util.ArrayList;

public class Customer {

    public ArrayList<Double> Transactions;
    private String Name;

    public Customer(String name) {
        this.Name = name;
        this.Transactions = new ArrayList<Double>();
    }

    public String getName() {

        return Name;
    }
}
