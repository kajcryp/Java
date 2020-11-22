package kajahnanArrays;

import java.util.Scanner;

public class Main {
    private static Scanner newInput = new Scanner(System.in);
    private static String myNumber = "07718909539";
    private static MobilePhone onePlus = new MobilePhone(myNumber);


    public static void main (String[] args){

        boolean quit = false;
        startPhone();
        printSelection();
        printContacts();

        while(!quit) {
            System.out.println("Enter your action: ");
            int action = newInput.nextInt();
            newInput.nextLine();

            switch (action) {
            case 0:
                endPhone();
                break;
            case 1:
                printContacts();
                break;
            case 2:
                addContact();
                break;
            case 3:
                updateContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                queryContact();
                break;
            case 6:
                printSelection();
                break;
            }
        }
    }

    private static void addContact(){
        System.out.println("Enter a new contact name: ");
        String name = newInput.nextLine();
        System.out.println("Enter a new phone number: ");
        String number = newInput.nextLine();
        Contacts newContact = Contacts.createContact(name, number); // referenced to the old contact class but we haven't used an object, we haven't created a new instance
                                                                    // and we can do this because it's a static method in the contact class as it's a conveniuence method
                                                                    // and we want to do this to create a new contact record without having to create a new contact class
                                                                    // without having an instance or an object to call upon
        if(onePlus.addContact(newContact)){
            System.out.println("New contract added: " + name + " and their phone number is: " + number);
        } else {
            System.out.println("Cannot add: " + name + " as name already on list of contacts");
        }

        printSelection();
    }

    private static void updateContact() {
        System.out.println("Enter a new contact name: ");
        String name = newInput.nextLine();
        Contacts existingContactRecord = onePlus.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact is not found");
            return;
        }

        System.out.println("Enter a new name: ");

        String newName = newInput.nextLine();
        System.out.println("Enter new phone number: ");
        String newPhoneNumber = newInput.nextLine();

        Contacts newContactRecord = Contacts.createContact(newName, newPhoneNumber);
        if(onePlus.updateContact(existingContactRecord, newContactRecord)){             //using if statement as updateContact() returns a boolean
            System.out.println("Successfully added contact: " + newContactRecord.getName());
        } else {
            System.out.println("New contact: " + newContactRecord.getName() + " could not added");
        };

        printSelection();
    }

    private static void removeContact() {
        System.out.println("Enter a new contact name: ");
        String name = newInput.nextLine();
        Contacts existingContactRecord = onePlus.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact is not found");
            return;
        }

       //Contacts removedContact = onePlus.queryContact(name);
       if(onePlus.removeContact(existingContactRecord)){
           System.out.println("Successfully removed contact: " + existingContactRecord.getName());
       } else{
           System.out.println("New contact: " +existingContactRecord.getName() + " could not removed");
       }

        printSelection();

    }

    private static void queryContact() {
        System.out.println("Enter a new contact name: ");
        String name = newInput.nextLine();
        Contacts queriedContactRecord = onePlus.queryContact(name);
        if (queriedContactRecord == null) {
            System.out.println("Contact is not found");
            return;
        }

        System.out.println("Contact: " + queriedContactRecord.getName() + " exists and their phone number is: " + queriedContactRecord.getPhoneNumber());

        printSelection();
    }


    public static void startPhone(){
        System.out.println("Starting phone ...");
    }

    public static void endPhone(){
        System.out.println("Ending phone ...");
    }

    public static void printSelection(){
        System.out.println("\n Available actions: \npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a contact \n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - query if an existing contact exists\n" +
                           "6 - to print a list of available actions\n"
                            );
        System.out.println("Choose your action");
    }

    public static void printContacts(){
        onePlus.printContact();
        printSelection();
    }

}
