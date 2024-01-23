package chapter01.item05;

import chapter01.item05.core.SpellChecker;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    @Test
    void test(){
        SpellChecker spellChecker = new SpellChecker(new MockLexicon());
        Assertions.assertThat(spellChecker.isValid("abc")).isTrue();
    }

}