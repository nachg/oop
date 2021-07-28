package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LessThanTest {

    @Test
    void resultShouldBeTrue() throws Exception {
        assertThat(
                new LessThan(2,3).evaluate()
        ).isEqualTo(true);
    }

    @Test
    void resultShouldBeFalse() throws Exception {
        assertThat(
                new LessThan(3,2).evaluate()
        ).isEqualTo(false);
    }
}