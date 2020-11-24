package kajahnan;

import java.util.ArrayList;

//This class is like a wrapper and we're using it to wrap this functionality
class IntClass{

    private int myValue;   // variable that contains value for this class

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {


    public static void main(String[] args){

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();   //We see String is working but usually a primitive type. However String is also a java class
                                                                    // which is why it works. to see it hold ctrl button and then click on String to get the class
        strArrayList.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>();  //We get an error because arraylists doesn't allow primitive types. You can only put classes in

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54)); // This will for the new arraylist of class/type IntClass, it'll add 54 as the first value

        //autoboxing

        Integer firstInteger = new Integer(54); // different is that this is a class and not a primitive type unlike int
        Double DoubleValue = new Double(34.7);


        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i =0; i<10; i++){
            integerArrayList.add(Integer.valueOf(i));  // .Valueof() is taking value of i as primitive type and changing it to an integer class.
                                                       // This is autoboxing where you convert primitive to class e.g. int to integer
        }

        for(int i =0; i<10; i++){
            System.out.println(i + "-->" + integerArrayList.get(i).intValue()); //.intValue() changes it to an int value again
                                                                                // unboxing is changing it from class or object wrapper to primitive type
        }

        Integer myIntValue = 56; // This works as in compile time it's read as Integer.valueOf(56) won't work with 56.6 as double
        int myInt = myIntValue; // myIntValue.intValue(i)

        ArrayList<Double> myDoubleValues = new ArrayList<Double>(); // doesn't work as double needs to be Double for ArrayList
        for(Double dbl = 0.0; dbl <= 10.00; dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }


        for(int i = 0; i < myDoubleValues.size(); i ++){
            double value = myDoubleValues.get(i).doubleValue(); // returning values in arraylist as a double
            System.out.println(i + "--->" + value);
        }

    }


}
