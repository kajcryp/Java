package com.kaj;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];

    private ArrayList<String> groceryList = new ArrayList<String>(); // we add brackets cos ArrayList is a class so it can have
                                                                     // its own constructor

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ", " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    // finding an item from the grocery list
    public String findItem(String searchItem){
        boolean exists = groceryList.contains(searchItem); // select the name of the list and returns true if item is found
        int position = groceryList.indexOf(searchItem); // returns the index position of the array list in that item
        if (position >=0) {
            return groceryList.get(position);
        } else {
            return null;
        }

    }
}
