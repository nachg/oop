package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComposeTest {

    @Test
    void positive() {
        //implementations of ((2+2) - (2-1)) + (abs((3-4)))
        assertThat(
                new Plus(
                        new Minus(
                                new Plus(2, 2),
                                new Minus(2, 1)
                        ),
                        new Abs(
                                new Minus(3, 4)
                        )
                ).toDouble()
        ).isEqualTo(4.0);
    }

}