package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DivTest {

    @Test
    void numberShouldBePositive() throws Exception {
        assertThat(
                new Div(6.3, 3).toDouble()
        ).isEqualTo(2.1);
    }

    @Test
    void numberShouldBeNegative() throws Exception {
        assertThat(
                new Div(6.3, -3).toDouble()
        ).isEqualTo(-2.1);
    }


}