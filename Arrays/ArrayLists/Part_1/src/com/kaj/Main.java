package com.kaj;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in); // creating a new scanner object where the next input in the terminal is s
    private static int[] baseData = new int[10];
    public static GroceryList groceryList = new GroceryList();


    public static void main (String[] args){
        //Array pt 2
        boolean quit = false;
        int choice = 0;
        printInarructions();
        while(!quit) {
            System.out.println("Enter your choice: " );
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 0:
                    PrintInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modify
                Item();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }



        // array pt1
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers:");
        getInput();
        printArray(baseData);
    }

    private static void getInput(){
        for(int i = 0; i < baseData.length; i++){
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }

    private static void resizeArray(){
        int [] original = baseData;

        baseData = new int[12];
        for (int i =0; i < original.length; i++){
            baseData[i] = original[i];
        }
    }


}
