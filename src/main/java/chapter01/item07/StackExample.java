package chapter01.item07;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackExample {
    private  Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackExample() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object o){
        ensureCapacity();
        elements[size++] = o;
    }

    public Object pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    private void ensureCapacity() {
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}
