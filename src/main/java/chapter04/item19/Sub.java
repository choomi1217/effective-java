package chapter04.item19;

import java.time.Instant;

public class Sub extends Super{

    private final Instant instant;

    public Sub() {
        this.instant = Instant.now();
    }


    @Override
    protected void overrideMe() {
        System.out.println(instant);
    }
}
