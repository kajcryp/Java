package house;

public class bed {
    private int pillows;
    private int quilt;
    private int sheets;

    public bed( int pillows, int quilt, int sheets) {

        this.pillows = pillows;
        this.quilt = quilt;
        this.sheets = sheets;
    }

    public void make(){
        System.out.println("Bed --> Maked");
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getSheets() {
        return sheets;
    }
}
