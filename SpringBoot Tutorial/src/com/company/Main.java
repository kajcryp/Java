
package com.company;
import java.util.*;


class Main {

    public static void main(String[] args) {
        System.out.println("program begin");

        //stack
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(4);
        stack.pop(); // trying to remove the top item from the stack which is 4 as you added it after 5
        stack.push(3);
        stack.push(2);
        stack.push(1);

        int stackSize = stack.size();

        System.out.println("There are " + stackSize + " elements in the stack");

        //you use stacks instead of arrays and array lists as its easy to remove items

        while(stack.isEmpty() == false) {
            int top = stack.peek(); // finds top item of the stack
            System.out.print(top + " ");
            stack.pop();
        }
        System.out.println();

        // Queue
        Queue<Integer> q = new LinkedList<>(); // its a first in and first out data structure
        q.add(4);
        q.add(5);
        q.add(2);

        int qSize = q.size();
        System.out.println("There are " + qSize + " elements in the queue");

        while (q.isEmpty() == false) {
            int top = q.peek(); // top of the queue which is the 4 we put in first
            System.out.print(top + " ");
            q.remove(); // remove the item from the front which is 4 at first and then becomes 5
        }

        System.out.println();


        //priority queue
        PriorityQueue<String> pq = new PriorityQueue<String>();

        pq.add("B");
        pq.add("Q");
        pq.add("S");
        pq.add("A");
        pq.add("Z");
        pq.add("L");
        pq.add("P");

        int pqsize = pq.size();
        System.out.println("There are " + pqsize + " elements in the priority queue.");

        while(pq.isEmpty() == false)
        {
            String top = pq.peek(); // The front of the queue.
            System.out.print(top + " ");
            pq.remove(); // Remove this front of the queue.
        }
        System.out.println();

        //////////////////////////////////////

        Set<String> set = new TreeSet<String>();

        set.add("src");
        set.add("make");
        set.add("java");
        set.add("make");
        set.add("src");
        set.add("icecream");
        set.add("curtains");


        int setSize = set.size();
        System.out.println("There are " + setSize + " elements in the set.");

        for(String setItem : set) {
            System.out.println(" " + setItem + " |");
        }
        System.out.println();

        System.out.println("Program ended.");
    }

}