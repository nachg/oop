package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InterpreterTest {


    @Test
    void toDoubleForTwoArgsWithOperator() throws Exception {

    }

    @Test
    void toDoubleForOneVar() throws Exception {

    }

    @Test
    void toDoubleForMultOfTwoVars() throws Exception {
        Interpreter interpreter = new Interpreter();

        interpreter.addLine(new SyntaxParser(new LexicalParser("$A = 7 - 2")));
        interpreter.addLine(new SyntaxParser(new LexicalParser("$B = 5 + 2")));
        interpreter.addLine(new SyntaxParser(new LexicalParser("$B * $A")));
        assertThat(
                interpreter.evaluate()
        ).isEqualTo(35);

    }


}