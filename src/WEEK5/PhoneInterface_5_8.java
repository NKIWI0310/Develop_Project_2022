package WEEK5;

interface PhoneInterface8 {
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("** Phone **");
    }
}
class SamsungPhone8 implements PhoneInterface8 {
    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }
    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }
    public void flash() { System.out.println("전화기에 불이 켜졌습니다."); }
}

public class PhoneInterface_5_8 {
    public static void main(String[] args) {
        SamsungPhone8 phone = new SamsungPhone8();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}
