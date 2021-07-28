package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoreThanTest {

    @Test
    void resultShouldBeTrue() throws Exception {
        assertThat(
                new MoreThan(3,2).evaluate()
        ).isEqualTo(true);
    }

    @Test
    void resultShouldBeFalse() throws Exception {
        assertThat(
                new MoreThan(2,3).evaluate()
        ).isEqualTo(false);
    }
}