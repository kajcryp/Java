package InnerClass_Tutorial;

import java.util.ArrayList;

public class GearBox {
    //To refer to the gearNumber from a gearbox


    private ArrayList<Gear> Gears;
    private int maxGears;
    private int currentGear = 0; //Renamed from GearNumber
    private boolean clutchIsIn;

    public GearBox(int maxGears){
        this.maxGears = maxGears;
        this.Gears = new ArrayList<Gear>();
        Gear neutral = new Gear (0,0.0);
        this.Gears.add(neutral);

        for(int i = 0; i<maxGears; i++){
            addGear(i, i*5.3);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if((number > 0) && (number <= maxGears)){
            this.Gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if((newGear >=0) && (newGear < this.Gears.size()) && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");

        } else{
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs + Gears.get(currentGear).getRatio();
    }

    private class Gear{ // A member of GearBox
        // A gear isn't something that's useful in its own right and so we couple it with a gearbox which makes it useful
        // Which is why we use an inner class as it doesn't make sense to use it without the context

        //Instances of the Gear class have got access to all the methods and fields of the outer gearbox class even those marked as private
        //e.g. this.GearNumber is talking about Gear class(Inner class) and not gear number from class GearBox


        //To refer to the GearNumber from the GearBox from the instance of the Gear class, you have to use Gearbox.this.gearNumber (this is why we r


        private int GearNumber;  //Shadowing GearNumber from the GearBox class
        private double ratio;

        public Gear(int gearNumber, double ratio) {

            this.GearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs){
            return revs*(this.ratio);
        }

    }


}
