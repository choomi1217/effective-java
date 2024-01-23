package chapter01.item03.alone;

/**
 * 정적 팩터리 메서드 방식의 싱글턴
 * */
public class SingletonMethod {
    private static final SingletonMethod INSTANCE = new SingletonMethod();
    public static SingletonMethod getInstance() {
        return INSTANCE;
    }
}
