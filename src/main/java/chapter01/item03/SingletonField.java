package chapter01.item03;

import java.io.Serializable;

/**
 * 필드 방식의 싱글턴
 * */
public class SingletonField implements Serializable {
    public static final SingletonField INSTANCE = new SingletonField();
    private static boolean created;

    private SingletonField() {
        if (created) {
            throw new IllegalStateException("Singleton already created");
        }
        created = true;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
