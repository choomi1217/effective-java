package chapter01.item03;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.INSTANCE;
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton3 singleton3 = Singleton3.INSTANCE;
    }
}
