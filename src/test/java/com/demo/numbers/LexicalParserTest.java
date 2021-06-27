package com.demo.numbers;

import com.demo.numbers.base.LexicalParser;
import org.junit.jupiter.api.Test;

import static com.demo.numbers.base.LexicalParser.ERROR_NO_STRING_CONTENT;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LexicalParserTest {

    @Test
    void nextForOneArg() throws Exception {
        assertThat(
                new LexicalParser("1")
                        .next()
        ).isEqualTo("1");
    }

    @Test
    void nextForOneArgWithSpaces() throws Exception {
        assertThat(
                new LexicalParser(" 1 ")
                        .next()
        ).isEqualTo("1");
    }

    @Test
    void nextForOneAWithTwoNextCalls() throws Exception {
        LexicalParser lp = new LexicalParser("1");

        assertThat(
               lp.next()
        ).isEqualTo("1");

        checkForException(lp);
    }

    @Test
    void nextForTwoArg() throws Exception {
        LexicalParser lp = new LexicalParser("1 2");

        assertThat(lp.next()).isEqualTo("1");
        assertThat(lp.next()).isEqualTo("2");
    }

    @Test
    void nextForTwoArgWithOuterSpaces() throws Exception {
        LexicalParser lp = new LexicalParser(" 1 2 ");

        assertThat(lp.next()).isEqualTo("1");
        assertThat(lp.next()).isEqualTo("2");
    }

    @Test
    void nextForTwoArgWithInnerSpaces() throws Exception {
        LexicalParser lp = new LexicalParser("1  2");

        assertThat(lp.next()).isEqualTo("1");
        assertThat(lp.next()).isEqualTo("2");
    }

    @Test
    void nextForBlankString() {
        checkForException(new LexicalParser(""));
    }


    private void checkForException(LexicalParser lp) {
        assertThatThrownBy(() -> {
           lp.next();
        }).isInstanceOf(Exception.class)
                .hasMessageContaining(ERROR_NO_STRING_CONTENT);
    }
}


