package Notes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorNotes {



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(15);
        list.add(21);
        list.add(45);
        list.add(76);

        // Output should be:     | 15 | 21 | 45 | 76

        //Iterator is the line between the numbers. In this case its the "|" before 15

        Iterator here = list.iterator();

        // you don't say (Iterator here = new Iterator) because there's different implementations of the different data structures you can iterate through.
        // For example a hash set won't iterate the same way as an array list would

        // so for iteration you have name of thing you're trying to iterate then you have .iterator()

        System.out.println(here.next()); // output is number before line so will be 15
        //.next() it moves us between different lines so in this case: "|" 15 --------> 15 "|" 21

        System.out.println(here.next()); // output is number before line so will be 21

        here.remove(); // it won't output anything but will remove the element before this iterator. In this case 21





        ArrayList<String> StringList = new ArrayList<String>();

        StringList.add("come");
        StringList.add("as");
        StringList.add("you");
        StringList.add("are");

        Iterator StringHere = StringList.iterator();

        String str = StringHere.next();
        // In this case I want come to be stored as string but problem is it leads to error.
        // This is because iterator stores and returns objects so in order to pull it out and class it as a string.
        // You will need to class cast it as a string and then it'll be able to store it and print "come"

        //Better way to do this is:

        Iterator<String> StringHere2 = StringList.iterator();
        // Having a type parameter of <String> indicating everything in this indicator is a string
        // and important to tell iterator what data type you're trying to loop through

        String StringingIt = StringHere2.next();

        System.out.println(StringingIt);

        ListIterator<>;
        //
    }



}
