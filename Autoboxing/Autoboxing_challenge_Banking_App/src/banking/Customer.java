package banking;

import java.util.ArrayList;

public class Customer {

    public ArrayList<Double> Transactions;
    private String Name;

    public Customer(String name, double initialAmount) {
        this.Name = name;
        this.Transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.Transactions.add(amount);
    }

    public String getName() {

        return Name;
    }

    public ArrayList<Double> getTransactions() {

        return Transactions;
    }
}
