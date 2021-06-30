package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InterpreterTest {

        @Test
    void getOperatorForTwoArgsAndOperator() throws Exception {
        assertThat(
                new Interpreter
                        (new LexicalParser("2 + 1")
                                ).getOperator()
        ).isEqualTo("+");
    }

    @Test
    void toDoubleForTwoArgsWithOperator() throws Exception {
        assertThat(
                new Interpreter
                        (new LexicalParser("7 - 2")
                                ).toObject().toDouble()
        ).isEqualTo(5);

        assertThat(
                new Interpreter
                        (new LexicalParser("7 + 2")
                        ).toObject().toDouble()
        ).isEqualTo(9);

        assertThat(
                new Interpreter
                        (new LexicalParser("7 * 2")
                        ).toObject().toDouble()
        ).isEqualTo(14);

        assertThat(
                new Interpreter
                        (new LexicalParser("7 / 2")
                        ).toObject().toDouble()
        ).isEqualTo(3.5);
    }


}