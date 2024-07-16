package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void addingNegative() {
        assertThat(Main.add(0, -2)).isEqualTo(-2);
    }

    @Test
    void addingZero() {
        assertThat(Main.add(0, 4)).isEqualTo(4);
    }

    @Test
    void addingPositive() {
        assertThat(Main.add(100, 4)).isEqualTo(104);
    }

    @Test
    void subtractingNegative() {
        assertThat(Main.subtract(0, -2)).isEqualTo(2);
    }

    @Test
    void subtractingZero() {
        assertThat(Main.subtract(4, 0)).isEqualTo(4);
    }

    @Test
    void subtractingPositive() {
        assertThat(Main.subtract(100, 4)).isEqualTo(96);
    }

    @Test
    void multiplyingNegative() {
        assertThat(Main.multiply(-1, 4)).isEqualTo(-4);
    }

    @Test
    void multiplyingZero() {
        assertThat(Main.multiply(0, -2)).isEqualTo(0);
    }

    @Test
    void multiplyingPositive() {
        assertThat(Main.multiply(100, 4)).isEqualTo(400);
    }

    @Test
    void dividingNegative() {
        assertThat(Main.divide(2, -2)).isEqualTo(-1);
    }

    @Test
    void dividingPositive() {
        assertThat(Main.divide(100, 4)).isEqualTo(25);
    }
}