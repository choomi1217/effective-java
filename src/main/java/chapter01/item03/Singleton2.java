package chapter01.item03;

public class Singleton2 {
    private static final Singleton2 INSTANCE = new Singleton2();
    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}
