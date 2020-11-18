package kajahnanArrays;

import java.util.ArrayList;

public class MobilePhone {

    public String myNumber;
    private ArrayList<Contacts> mycontacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.mycontacts = new ArrayList<Contacts>();
    }

    public boolean addContact(Contacts contact){

        if(findContact(contact.getName()) >= 0) {
           System.out.println("Contact is already on file");
           return false;
        } else {
            mycontacts.add(contact);
            return true;
        }
    }

    public void printContact(){
        for(int i=0; i < mycontacts.size(); i++){
            System.out.println( (i+1) + " ." + "The contact " + mycontacts.get(i).getName() +
                                " and his phone number " + mycontacts.get(i).getPhoneNumber()); // the .get(i) - because we defined array as type contact,
                                                                                                // java knows its a contact class which allows the getName() and getPhoneNumber() to work
        }

    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition > 0) {
            this.mycontacts.set(foundPosition, newContact)
            System.out.println(oldContact.getName() + "is being replaced with new contact " + newContact.getName());
            return true;

        }   else {
            System.out.println(oldContact.getName() + "was not found.");
            return false;
        }
    }

    private int findContact(Contacts searchedContact){
        int position = mycontacts.indexOf(searchedContact); //returns an integer showing element position of that the contact is in the array
        if(position >=0) {
            return mycontacts.get(position);
        } else {

        }
    }

    private int findContact(String contactName) { //loop through all the records and extract the name out and compare that with name passed
        // and return index position if contact is on the file
        for (int i = 0; i < this.mycontacts.size(); i++) {
            Contacts contact = this.mycontacts.get(i); // create a new object and using the get function to get the contact name
            if (contact.getName().equals(contactName)) { // if the name that you get from the contacts list is same as name passed through method
                return i;                                // i is element of the array position number we found this record in to see if we can
            }
            // add record depending on methods above
        }
        return -1; // if not in the position return negative 1
    }

    public String queryContact(Contacts contact) {
        if(findContact(contact)>0) {
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        
    }

    public boolean removeContact(Contacts contact){
        int position = findContact(contact);
        if(position >=0) {
            mycontacts.remove(position);
            System.out.println(contact.getName() + "Contact was  removed");
            return true;
        } else {
            System.out.println("That contact wasn't present");
            return false;
        }
    }
}
