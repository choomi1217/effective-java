package chapter01.item03;

import java.io.*;

/**
 * 역직렬화를 이용해 여러 인스턴스 만들기
 * */
public class Serialization {
    public static void main(String[] args) {
        SingletonField singletonField = SingletonField.INSTANCE;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("field.obj"))) {
            out.writeObject(SingletonField.INSTANCE);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("field.obj"))){
            SingletonField singletonField1 = (SingletonField) in.readObject();
            System.out.println(singletonField);
            System.out.println(singletonField1);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
