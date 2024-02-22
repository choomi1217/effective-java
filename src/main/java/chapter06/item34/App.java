package chapter06.item34;

public class App {
    public static void main(String[] args) {
        System.out.println(PayrollDay.MONDAY.pay(10, 100));
        System.out.println(PayrollDay.SATURDAY.pay(10, 100));
    }
}
