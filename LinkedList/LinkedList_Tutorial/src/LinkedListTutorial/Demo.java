package LinkedListTutorial;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Perth");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Darwin");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit); //Linkedlist has changed now cos of new entry

        placesToVisit.remove(4);
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();  //Iterator is another way of accessing and going through all entries in a particular array
                                                     // This iterator is similar to a for loop but in a different way
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next()); //
        }
        System.out.println("=================="); // to signal the end

        //LinkedList is pointing to another entry. So what we're doing here is while that entry(element in this linked list is pointing to something else,
        // while this is true, we're actually going to show the current record.
        // i.next() is equivalent to i++. so output i.next which outputs current record which also then moves on to the next record as well
        // hasNext() is to see if there's another entry but .next() is moving to the next entry and so is returning current entry before moving on.
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator(); //Provides more flexibility than traditional iterator. made for situations of inserting records
        //list iterator is not pointing ot the first record. you need to use a stringListIterator.next() to go to the first record

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);  // This gives us a number and if zero, it means value in string added (newCity)
                                                                            // is linked list in current entry we're searching for and is equal

            if(comparison ==0){
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false; //nothing was successfully added
            } else if(comparison > 0){
                // new city should appear before this one
                // Brisbane -> Adelaide
                // problem is we're already done the comparison with .next() which returned the current entry but moved to the next entry automatically
                stringListIterator.previous(); //Means you go back to the previous entry, the previous match, so in this case go back to previous record linked to this one
                stringListIterator.add(newCity); //we add city at this point so that ultimately it appears before the entry.

                //e.g. if we're looking at Brisbane and we found Adelade, Adelade was passed as a parameter. So using the .previous(), we go back to the Brisbane record
                // and by using .add(), we're going ot add it and it appears before that entry

                return true;
            } else if(comparison < 0){
                // move on to next city
                // situation where we found Brisbane passed as a parameter and we're actually at Adelaide, Brisbane doesn't come before Adelaide, so we don't want to do anything in that case
                // as we need to move on to the next record as record can't be added here
                // also with.next() we've already moved on to the next record anyway
            }
        }

        stringListIterator.add(newCity);
        return true;
    }


}
