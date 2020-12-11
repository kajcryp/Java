package InnerClass_Tutorial;

import java.util.Scanner;

public class Main {
    // 4 types of nested classes

    //Non Static Nested classes - We call this an inner class
    //We can use a local class - inner class defined inside a scope block - which is usually a method
    //An anonymous class - a nested class without a class name

    // Static nested class - used to associate a class with its outer class.
    // think of it as identical to a top level class but difference is it's packaged in it outer class rather than in the package.
    // So it means it cannot access non static methods or members of its outer class without first creating an instance of that class


    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        GearBox McClaren = new GearBox(5);

        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }

        }

        btnPrint.setOnClickListener(new ClickListener());
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;

                case 1:
                    btnPrint.onClick();

            }
        }
    }



//        McClaren.addGear(1,5.6);
//        McClaren.addGear(2,10.6);
//        McClaren.addGear(3,15.9);
//        McClaren.operateClutch(true);
//        McClaren.changeGear(1);
//        McClaren.operateClutch(false);
//        System.out.println(McClaren.wheelSpeed(1000));
//        McClaren.changeGear(2);
//        System.out.println(McClaren.wheelSpeed(3000));
//        McClaren.operateClutch(true);
//        McClaren.changeGear(3);
//        McClaren.operateClutch(false);
//        System.out.println(McClaren.wheelSpeed(6000));


        //part1      GearBox.Gear first = McClaren.new Gear(1, 12.3);

        //To create a Gear class. Since Gear is an inner class to GearBox, we need to specify the outer class
        //so We use Gearbox instance created in McClaren and use .new for the Gear
        //You get an error if you try to create a gear object without creating an instance of Gearbox to create it from

        // GearBox.Gear Second = new GearBox.Gear(2, 15.4);
        // You get an error message with above of not being an enclosing class so we need to create the GearBox first
        // Also this doesn't work:

        // GearBox.Gear third = new McClaren.Gear(2, 17.8);

  //part1      System.out.println(first.driveSpeed(1000)); //however if Gear class becomes private, then this brings error messages



 //   }

}
