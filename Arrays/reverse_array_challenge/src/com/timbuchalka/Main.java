package com.timbuchalka;

import java.util.Arrays;

public class Main {

        public static void main(String[] args) {

            int [] array = { 1 , 5, 3, 7, 11, 9, 15};

            System.out.println("Array = " + Arrays.toString(array));

            reverse(array);

            System.out.println("Reversed array = " + Arrays.toString(array));
        }

        private static void reverse(int[] array){       //Trying to reverse the order of items in an Array

            int maxIndex = array.length -1; // represents maximum index value
                                           // index ranges from the length of the array -1 as it starts with o

            int halfLength = array.length/2; // represent half of array length
                                             // to continue this we need to loop in the array til we get to halfway point

            for (int i = 0; i < halfLength; i++) {
                int temp = array[i]; // inside loop we want to swap two elements so we need to create a temporary variable
                                     // since array starts with index starting with position o, swap element from index 0
                                     // with element from last index.
                array[i] = array[maxIndex -i];
                array[maxIndex - i] = temp; // in temp we're moving first variable in array to the last index


            }
        }

}
