package chapter04.item19;

import java.util.Map;

public class SuperSubApp {

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();

        Map map = Map.of("key", "value");
    }

}
