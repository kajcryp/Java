package kaj_Interfaces;

public interface ITelephone {

    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();

    //public here is redundant as we're using the method in the class

    //for a class to implement from this interface, these are the methods it has to implement so you don't write code in the interface,
    // you write it in the class but we've just defined the contract and the parameters and return type of each method that will overall will make this a valid class

    // To implement this usercase, you need to use a class
}
