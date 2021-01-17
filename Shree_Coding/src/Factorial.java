public class Factorial {

    int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int iterative(int numberForFactorial){
        int index = numberForFactorial+1;
        for(int i = 1; i < index; i++) {
            int firstNumber = i;
            int secondNumber = i + 1;

            if (i < index) {
                System.out.println("Multiplication applied");
                int output =  firstNumber * secondNumber;
                System.out.println(output);
            }
        }
        System.out.println("Multiplication not applied");
        return -1;
    }

    public int iterative2(int number){
        int sum = 1;
        for(int i = 1; i<=number; i++){
            sum = sum*i;
            //System.out.println(sum);
        }
        System.out.println(sum);
        return sum;
    }

    public int recursive2(int number){
        int sum = number-1;
        for(int i = number; i>0; i--){
            int x = sum;
            sum = sum*i;
            System.out.println(x + " times " + i + " = " + sum);
        }
       // System.out.println(sum);
        return sum;
    }

    public int recursive(int numberForFactorial){
        int index = 0;
        for(int i = numberForFactorial; i>index; i--){
            int firstNumber = i;
            int secondNumber = i-1;
            int output = firstNumber*secondNumber;
            System.out.println("Multiplication applied, output is " + output);
        }
        return -1;
    }
}
