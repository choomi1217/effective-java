package chapter01.item03.inclass.field;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ConcertTest {

    @Test
    void perform() {
        Concert concert = new Concert(new MockElvis());
        concert.perform();

        assertThat(concert.isLightsOn()).isTrue();
        assertThat(concert.isMainStateOpen()).isTrue();
    }
}