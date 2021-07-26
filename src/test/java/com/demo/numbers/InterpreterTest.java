package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InterpreterTest {


    @Test
    void toDoubleForTwoArgsWithOperator() throws Exception {
        Interpreter interpreter = new Interpreter();
        interpreter.send(new LexicalParser("7 - 2"));
        assertThat(
                interpreter.evaluate()
        ).isEqualTo(5);

    }

    @Test
    void toDoubleForOneVar() throws Exception {
        Interpreter interpreter = new Interpreter();
        interpreter.send(new LexicalParser("$A = 7 - 2"));
        assertThat(
                interpreter.evaluate()
        ).isEqualTo(5);

    }

    @Test
    void toDoubleForMultOfTwoVars() throws Exception {
        Interpreter interpreter = new Interpreter();

        interpreter.send(new LexicalParser("$A = 7 - 2"));
        interpreter.send(new LexicalParser("$B = 5 + 2"));
        interpreter.send(new LexicalParser("$B * $A"));
        assertThat(
                interpreter.evaluate()
        ).isEqualTo(35);

    }


}