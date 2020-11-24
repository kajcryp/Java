package banking;

import java.util.ArrayList;

public class Branches {

    private ArrayList<Customer> BranchCustomers;
    private ArrayList<Transaction> CustomerTransactions;

    private int findCustomer1 (String searchedCustomer){
        for(int i=0; i<BranchCustomers.size(); i++){
        Customer customer = BranchCustomers.get(i);
            if(customer.getName().equals(searchedCustomer)){
            return i;
            }
        }
        return -1;
    }

    private int findCustomer2 (Customer searchedCustomer){
        return BranchCustomers.indexOf(searchedCustomer);
    }

    public boolean addNewCustomer(Customer newCustomer){
        if(findCustomer1(newCustomer.getName()) >=0){
          System.out.println("Customer already there in Branch");
          return false;
        }

        System.out.println("Customer is not in the branch");
        BranchCustomers.add(newCustomer);
        return true;

    }

    public Transaction addTransaction(int newTransaction){
        Customer.Tr
        CustomerTransactions.add(newTransaction);
        System.out.println
    }

}
