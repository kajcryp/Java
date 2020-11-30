package banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private static Scanner newInput = new Scanner(System.in);

    private String BankName;
    public ArrayList<Branches> BankBranches;

    public Bank(String bankName) {
        this.BankName = bankName;
        this.BankBranches = new ArrayList<Branches>();
    }

    private int findBranch (String searchedBranchName){
        for(int i = 0; i<this.BankBranches.size(); i++){
            Branches branch = this.BankBranches.get(i);
            if(branch.getName().equals(searchedBranchName)){
                System.out.println("Branch has been found");
                return i;
            }
        }
        return -1;
    }

    private Branches findBranch2(String BranchName){
        int searchedBranch = findBranch(BranchName);
        if(searchedBranch>=0){
            return this.BankBranches.get(searchedBranch);
        }
        return null;
    }

    public Boolean addNewBranch(String searchedBranchName){
        int foundBranch = findBranch(searchedBranchName);
        if(foundBranch >= 0){
            System.out.println("Branch " + searchedBranchName + " is already there");
            return false;
        }
            System.out.println("Branch " + searchedBranchName + " needs to be added");
            Branches addingBranch = new Branches(searchedBranchName);
            this.BankBranches.add(addingBranch);
            return true;
    }

    public boolean addNewCustomerToBranch(String branch, String CustomerName, double initialAmount){
        int BranchNumber = findBranch(branch);
        if(BranchNumber>=0){
            System.out.println("Branch " + branch + " is already there");
            this.BankBranches.get(BranchNumber).addNewCustomer(CustomerName, initialAmount);
            System.out.println("Customer: " + CustomerName + " and initial transaction amount " + initialAmount + " is added to Branch: " + branch);
            return true;
        }
        System.out.println("Branch " + branch + " is not here. So we must add branch before we add a new customer");
        addNewBranch(branch);
        this.BankBranches.get(BranchNumber).addNewCustomer(CustomerName, initialAmount);
        System.out.println("Customer: " + CustomerName + "and initial transaction amount " + initialAmount + " is added to Branch: " + branch);
        return false;
    }

    public boolean addNewTransaction(String Branch, String Customer, double transactionAmount){
        int branchName = findBranch(Branch);
        if(branchName >= 0){
            System.out.println("Branch " + Branch + " is already there");
            this.BankBranches.get(branchName).addTransaction(Customer, transactionAmount);
            return true;
        }
        addNewCustomerToBranch(Branch, Customer, transactionAmount);
        return false;
    }

    public boolean ListTransactions(String branchName, boolean showTransactions){
        Branches branch = findBranch2(branchName);
        if(branch != null){
            System.out.println("Customers for branch: " + branch.getName());
            Scanner TransactionBoolean = new Scanner(System.in);
            System.out.println("Do you want to see the customer's transactions?");
            TransactionBoolean.nextBoolean();
            ArrayList<Customer> branchCustomers = branch.getBranchCustomers();
            for(int i = 0; i<branchCustomers.size(); i++){
                Customer BranchPersonCustomer = branchCustomers.get(i);
                System.out.println("Customer " + (i+1) +": " + BranchPersonCustomer.getName());
                if(showTransactions = true){
                    System.out.println("Transactions: ");
                    ArrayList<Double> CustomerTransactions = BranchPersonCustomer.getTransactions();
                    for (int x = 0; x< CustomerTransactions.size(); x++){
                      System.out.println("Transaction " + (x+1) + ": " + CustomerTransactions.get(x));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void addBranches(){
        System.out.println("Enter a new branch name: ");
        String BankName = newInput.nextLine();
        System.out.println("Enter a new customer name: ");
        String CustomerName = newInput.nextLine();
        System.out.println("Enter customer transaction: ");
        Double CustomerTransaction = newInput.nextDouble();

        Customer newCustomer = new Customer(CustomerName, CustomerTransaction);
        Branches newBranch = new Branches(BankName);
    }


}
