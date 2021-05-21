package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlusTest {

    @Test
    void positive() {
        assertThat(
                new Plus(1, 1).toDouble()
        ).isEqualTo(2.0);
    }

}