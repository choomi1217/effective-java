package chapter01.item03.alone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonField singletonField = SingletonField.INSTANCE;
        SingletonMethod singletonMethod = SingletonMethod.getInstance();
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

        /**
         * 열거 타입을 이용한 싱글턴에 Reflaction 이용해보기
         * */
        try {
            Constructor<SingletonEnum> enumConstructor = SingletonEnum.class.getDeclaredConstructor();
            enumConstructor.setAccessible(true);
            SingletonEnum singletonEnum1 = enumConstructor.newInstance();
            System.out.println(singletonEnum);
            System.out.println(singletonEnum1);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
