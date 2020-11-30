package LinkedListTutorial;

import java.util.Iterator;
import java.util.LinkedList;

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
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();  //Iterator is another way of accessing and going through all entries in a particular array
                                                     // This iterator is similar to a for loop but in a different way
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next()); //
        }
        System.out.println("==================");

         //LinkedList is pointing to another entry. So what we're doing here is while that entry(element in this linked list is pointing to something else,
        // while this is true, we're actually going to show the current record.
        // i.next() is equivalent to i++. so output i.next which outputs current record which also then moves on to the next record as well
        //hasNext() is to see if there's another entry but .next() is moving to the next entry and so is returning current entry before moving on.
    }
}
