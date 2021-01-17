import java.util.ArrayList;

public class Fibonacci {
    int number;
    ArrayList<Integer> fibonacci = new ArrayList<Integer>();

    public ArrayList<Integer> addingNumbers(int number){
        for(int i = 0; i < fibonacci.size(); i++) {
            fibonacci.add(i);
            System.out.println(i);
        }
        return fibonacci;
    }



}
