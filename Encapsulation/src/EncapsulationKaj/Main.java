package EncapsulationKaj;

public class Main {

    public static void main(String[] args){
        // create a class and demonstrate proper encapsulation techniques


        Printer printer = new Printer(50, 100, true);
        Printer SecondPrinter = new Printer(30, 200, false);
        System.out.println("Initial page count: " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer:" + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(6);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer:" + printer.getPagesPrinted());

        int secondPagesPrinted = SecondPrinter.printPages(3);
        System.out.println("Pages printed was " + secondPagesPrinted + " new total print count for printer:" + SecondPrinter.getPagesPrinted());

    }


}
