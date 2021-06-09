package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LessThanTest {

    @Test
    void resultShouldBeTrue() {
        assertThat(
                new LessThan(2,3).toBoolean()
        ).isEqualTo(true);
    }

    @Test
    void resultShouldBeFalse() {
        assertThat(
                new LessThan(3,2).toBoolean()
        ).isEqualTo(false);
    }
}