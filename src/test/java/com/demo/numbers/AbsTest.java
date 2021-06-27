package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class AbsTest {

    @Test
    void positive() throws Exception {
        assertThat(
                new Abs(2).toDouble()
        ).isEqualTo(2.0);
    }

    @Test
    void negative() throws Exception {
        assertThat(
                new Abs(-2).toDouble()
        ).isEqualTo(2.0);
    }

    @Test
    void composed() throws Exception {
        assertThat(
                new Abs(
                        new Abs(-2)
                ).toDouble()
        ).isEqualTo(2.0);
    }
}