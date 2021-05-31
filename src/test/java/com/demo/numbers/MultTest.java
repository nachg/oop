package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultTest {

    @Test
    void numberShouldBePositive() {
        assertThat(new Mult(2.3, 2).toDouble()).isEqualTo(4.6);
    }

    @Test
    void numberShouldBeNegative() {
        assertThat(new Mult(2.3, -2).toDouble()).isEqualTo(-4.6);
    }


}