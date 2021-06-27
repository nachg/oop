package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AreEqualTest {

    @Test
    void resultShouldBeTrue() throws Exception {
        assertThat(
                new AreEqual(3,3).toBoolean()
        ).isEqualTo(true);

        assertThat(
                new AreEqual(true,true).toBoolean()
        ).isEqualTo(true);
    }

    @Test
    void resultShouldBeFalse() throws Exception {
        assertThat(
                new AreEqual(3,2).toBoolean()
        ).isEqualTo(false);
    }
}