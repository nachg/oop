package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InterpreterTest {


    @Test
    void toDoubleForTwoArgsWithOperator() throws Exception {
        assertThat(
                new Interpreter
                        (new LexicalParser("7 - 2")
                        ).toObject().toDouble()
        ).isEqualTo(5);

        assertThat(
                new Interpreter
                        (new LexicalParser("7 * 2")
                        ).toObject().toDouble()
        ).isEqualTo(14);

    }

    @Test
    void toDoubleForOneVar() throws Exception {
        assertThat(
                new Interpreter
                        (new LexicalParser("&V = 7 - 2")
                        ).toObject().toDouble()
        ).isEqualTo(5);

    }

    @Test
    void getNameForOneVar() throws Exception {
        new Interpreter(
                new LexicalParser("&A = 7 - 2"));

        assertThat(Interpreter.vars.get(0)
                .getName()
        ).isEqualTo("&A");
    }

    @Test
    void toDoubleForTwoVarFromStaticList() throws Exception {
        new Interpreter(
                new LexicalParser("&A = 7 - 2"));
        new Interpreter(
                new LexicalParser("&B = 4 - 2"));

        assertThat(Interpreter.vars.get(0)
                .getValue().toDouble()
        ).isEqualTo(5);

        assertThat(Interpreter.vars.get(1)
                .getValue().toDouble()
        ).isEqualTo(2);

    }

    @Test
    void toDoubleForMultOfTwoVars() throws Exception {
        new Interpreter(
                new LexicalParser("&A = 9 - 2"));
        new Interpreter(
                new LexicalParser("&B = 4 - 2"));

        assertThat(
                new Interpreter(
                        new LexicalParser("&A * &B")
                        ).toObject().toDouble()
        ).isEqualTo(14);

    }


}