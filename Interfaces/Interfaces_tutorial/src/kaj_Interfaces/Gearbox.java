package kaj_Interfaces;

public class Gearbox {

    private boolean clutchIsIn;

    public void operateClutch(String inOrOut){
        this.clutchIsIn = inOrOut.equalsIgnoreCase("In"); //If string value is set to value "in" then clutchIsIn boolean is set to true, otherwise set to false

    }

    public void operateClutch2(boolean inOrOut){
        this.clutchIsIn = inOrOut;
    }
}
