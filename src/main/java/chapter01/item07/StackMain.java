package chapter01.item07;

import java.util.stream.IntStream;

public class StackMain {

    public static void main(String[] args) {
        StackExample stackExample = new StackExample();
        IntStream.range(0, 1000).forEach(stackExample::push);
    }

}
