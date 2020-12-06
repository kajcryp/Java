package kaj_Interfaces;

public class MobilePhone implements ITelephone { // This line provides an error message if no methods included in class or not all methods are being overridden

    private int myNumber;
    private boolean isRinging;
    private boolean PhoneIsOn = false; //initially phone is turned off


    public MobilePhone(int myNumber) {

        this.myNumber = myNumber;
    }


    @Override
    public void powerOn() {
        PhoneIsOn = true;
        System.out.println("Mobile phone is powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(PhoneIsOn){
            System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
        } else{
            System.out.println("Phone is turned off");
        }
        System.out.println("Now ringing " + phoneNumber + " on desk phone.");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber ==myNumber && PhoneIsOn){
            isRinging = true;
            System.out.println("Melody Playing");
        } else{
            isRinging = false;
            System.out.println("Mobile phone is not on or number different");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
