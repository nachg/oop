package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComposeTest {

    @Test
    void resultShouldBepositive() {
        //implementations of ((2+2) * (2-1)) / (abs(2-4))
        assertThat(
                new Div(
                        new Mult(
                                new Plus(2, 2),
                                new Minus(2, 1)
                        ),
                        new Abs(
                                new Minus(2, 4)
                        )
                ).toDouble()
        ).isEqualTo(2.0);
    }

    @Test
    void resultShouldBeNegative() {
        //implementations of ((2+2) * (2-3)) / (abs(2-4))
        assertThat(
                new Div(
                        new Mult(
                                new Plus(2, 2),
                                new Minus(2, 3)
                        ),
                        new Abs(
                                new Minus(2, 4)
                        )
                ).toDouble()
        ).isEqualTo(-2.0);
    }

    @Test
    void resultShouldBeTrue() {
        //implementations of ((2+2) * (4-3)) - (abs(2-4)) > 0 is true
        assertThat(
                new MoreThan(
                        new Mult(
                                new Plus(2, 2),
                                new Minus(4, 3)
                        ),
                        new Abs(
                                new Minus(2, 4)
                        )
                ).toBoolean()
        ).isEqualTo(true);
    }

    @Test
    void resultShouldBeFalse() {
        //implementations of ((2+3) * (4-3)) - (abs(2-6)) = 0 is false
        assertThat(
                new AreEqual(
                        new Mult(
                                new Plus(2, 3),
                                new Minus(4, 3)
                        ),
                        new Abs(
                                new Minus(2, 6)
                        )
                ).toBoolean()
        ).isEqualTo(false);
    }

}