package banking;

import java.util.ArrayList;

private class Transaction {
    private ArrayList<Double> Transactions;

}
public class Customer {

        private ArrayList<Transaction> Transactions;
        private String Name;

    public Customer(double name) {
        this.Name = name;
        this.Transactions = new ArrayList<Transaction>();
    }

    public String getName() {
        return Name;
    }
}
