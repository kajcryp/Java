package LinkedListTutorial;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Tim", 54.74);
        Customer newCustomer;

        newCustomer = customer1;        //internally Java was assigning 2nd Customer class to point to the first class
        newCustomer.setBalance(12.18);  // so when you applied this method. You updated the first class
        System.out.println("Balance for customer " + customer1.getName() + " is " + customer1.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,2); //inserting actual number (2) in index position (1)

        for(int i = 0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

    }
}
