package banking;

import java.util.ArrayList;

private class Transaction {
    private ArrayList<Double> Transactions;

}
public class Customers {

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
