package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinusTest {

    @Test
    void positive() {
        assertThat(
                new Minus(3, 1).toDouble()
        ).isEqualTo(2.0);
    }

}