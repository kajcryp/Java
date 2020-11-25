package com.timbuchalka;

import java.util.ArrayList;

/**
 * Created by dev on 23/08/15.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //arrays part 3
    public void modifyGroceryItemTwo(String currentItem, String newItem){
        int position = findItemTwo(currentItem); // checking if the current item exists and if so it'll be changed to new item
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    //arrays part 3
    public void removeGroceryItem(String item){
        int position = findItemTwo(item);
        if(position >= 0){
            removeGroceryItem(position); // referencing method below
        }
    }
    //Arrays part 2
    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if(position >=0) {
            return groceryList.get(position);
        }

        return null;
    }

    //arrays part 3
    public int findItemTwo(String searchItem) {
        return groceryList.get(searchItem);

    }
}
