package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AreEqualTest {

    @Test
    void resultShouldBeTrue() {
        assertThat(
                new AreEqual(3,3).toBoolean()
        ).isEqualTo(true);
    }

    @Test
    void resultShouldBeFalse() {
        assertThat(
                new AreEqual(3,2).toBoolean()
        ).isEqualTo(false);
    }
}