package banking;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Bank NatwestBank = new Bank("Natwest");
        NatwestBank.addNewBranch("Croydon");
        NatwestBank.addNewCustomerToBranch("Croydon", "Jeff", 5.50);
        NatwestBank.addNewCustomerToBranch("Croydon", "Kaj", 6.86);
        NatwestBank.addNewCustomerToBranch("Croydon", "Thinesh", 345.50);


        NatwestBank.addNewBranch("Barnet");
        NatwestBank.addNewCustomerToBranch("Barnet", "Paul", 53.50);
        NatwestBank.addNewCustomerToBranch("Barnet", "Ryan", 26.73);

        NatwestBank.addNewTransaction("Barnet", "Paul", 78.94);
        NatwestBank.addNewTransaction("Barnet", "Paul", 658.94);
        NatwestBank.addNewTransaction("Croydon", "Thinesh", 98.94);

        NatwestBank.ListTransactions("Barnet", true);


    }
}
