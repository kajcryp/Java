package kaj_Interfaces;
//AN interface in Java terms specifies methods that a particular class that implements the interface, must implement
//interface you're creating now is abstract and so there's no actual code in any of the method, you only supply the method name and parameters
//idea is to create an interface that has a common behaviour that can be used by several classes that all implement the same interface


public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;       // You don't use new Itelephone as it'll populate the methods again from the interface
        timsPhone = new DeskPhone(12321321);

        timsPhone.powerOn();
        timsPhone.callPhone(12321321);
        timsPhone.answer();

        ITelephone MikelsPhone;

        MikelsPhone = new MobilePhone(89983322);
        MikelsPhone.powerOn();
        MikelsPhone.callPhone(89983322);
        MikelsPhone.answer();

    }


}
