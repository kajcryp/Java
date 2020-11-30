package banking;

import java.util.ArrayList;

public class Branches {

    private String name;
    private ArrayList<Customer> BranchCustomers;


    public Branches(String name) {
        this.name = name;
        this.BranchCustomers = new ArrayList<Customer>();
//        addNewCustomer(findCustomer1(name));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getBranchCustomers() {

        return BranchCustomers;
    }

    private int findCustomer1 (String searchedCustomer){
        for(int i=0; i<this.BranchCustomers.size(); i++){
        Customer customer = this.BranchCustomers.get(i);
            if(customer.getName().equals(searchedCustomer)){
            return i;
            }
        }
        return -1;
    }

    private int findCustomer2 (Customer searchedCustomer){

        return this.BranchCustomers.indexOf(searchedCustomer);
    }

    public boolean addNewCustomer(String newCustomer, Double transactionAmount){
        if(findCustomer1(newCustomer) >=0){
          System.out.println("Customer already there in Branch");
          return false;
        }

        System.out.println("Customer is not in the branch");
        this.BranchCustomers.add(new Customer(newCustomer, transactionAmount));
 //       newCustomer.Transactions.add(transactionAmount);
        return true;

    }

    public boolean addTransaction(String searchedCustomer, Double newTransaction){
        int indexOfCustomer = findCustomer1(searchedCustomer);
        if(indexOfCustomer >=0){
            System.out.println("Customer already there in Branch");
            Customer alreadyCustomer = this.BranchCustomers.get(indexOfCustomer);
            alreadyCustomer.addTransaction(newTransaction);
            System.out.println("Customer transaction " + newTransaction + " added");
            return true;
            }

        System.out.println("Contact is not here and will need to added re. The person's new transaction of " + newTransaction + " has been added");
        addNewCustomer(searchedCustomer, newTransaction);
        return false;
    }


}
