package com.demo.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CompareTest {

    @Test
    void resultShouldBeTrue() {
        assertThat(
                new Compare(1, 3).lessThan()
        ).isEqualTo(true);

        assertThat(
                new Compare(3, 1).moreThan()
        ).isEqualTo(true);

        assertThat(
                new Compare(3, 3).equals()
        ).isEqualTo(true);
    }

    @Test
    void resultShouldBeFalse() {
        assertThat(
                new Compare(3, 1).lessThan()
        ).isEqualTo(false);

        assertThat(
                new Compare(1, 3).moreThan()
        ).isEqualTo(false);

        assertThat(
                new Compare(3, 1).equals()
        ).isEqualTo(false);
    }


}