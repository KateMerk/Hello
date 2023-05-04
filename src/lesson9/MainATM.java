package lesson9;

public class MainATM {
    public static void main(String[] args) {
        ATM1 atm = new ATM1(20, 50, 100);
        atm.addMoney("fifty", 50);
        System.out.println(atm.getMoney(420));
    }
}
