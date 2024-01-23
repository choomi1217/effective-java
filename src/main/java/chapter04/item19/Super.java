package chapter04.item19;

public class Super {

    public Super() {
        overrideMe();
    }

    protected void overrideMe() {
        System.out.println("Super overrideMe");
    }
}
