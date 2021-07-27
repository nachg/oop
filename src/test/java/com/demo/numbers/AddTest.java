package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddTest {
    @Test
    void evaluateForTwoStrings() throws Exception {
        assertThat(
                new Add("abc", "def").evaluate()
        ).isEqualTo("abcdef");
    }

}