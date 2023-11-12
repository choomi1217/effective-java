package chapter01.item03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 생성자를 이용해 여러 인스턴스 만들기
 * */
public class DeclaredConstructor {
    public static void main(String[] args) {
        SingletonField singletonField = SingletonField.INSTANCE;

        try {
            Constructor<SingletonField> fieldConstructor = SingletonField.class.getDeclaredConstructor();
            fieldConstructor.setAccessible(true);
            SingletonField singletonField1 = fieldConstructor.newInstance();
            SingletonField singletonField2 = fieldConstructor.newInstance();
            System.out.println(singletonField);
            System.out.println(singletonField1);
            System.out.println(singletonField2);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
