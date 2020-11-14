package EncapsulationKaj;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean twoSidedPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean twoSidedPrinter) {
        if(tonerLevel >-1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = pagesPrinted;
        this.twoSidedPrinter = twoSidedPrinter;
    }


    public int addToner(int tonerAmount){
        if(tonerLevel>0 && tonerAmount <=100) {
            if(this.tonerLevel + tonerAmount >100) {
                return -1;
            } else{
                return this.tonerLevel + tonerAmount;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(twoSidedPrinter){
            pagesToPrint = (pages/2) + (pages % 2);
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;

        } else {
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
