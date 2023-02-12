package pl.javastart.euler2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.NoSuchElementException;
import static org.assertj.core.api.Assertions.assertThat;

public class Euler2Test {
    Euler2 euler2 = new Euler2();

    @ParameterizedTest
    @CsvSource({"10,10", "34, 44"})
    void shouldReturnExpectedValue(int limit, int expected) {
        Assertions.assertEquals(expected, euler2.calculateSumOfEvenFibonacciElements(limit));
    }

    @Test
    public void shouldReturnExceptionForFirstElement() {
        try {
            euler2.calculateSumOfEvenFibonacciElements(1);
        } catch (NoSuchElementException e) {
            assertThat(e.getMessage()).isEqualTo("No value present");
            return;
        }
        Assertions.fail("Expected exception was not thrown!");
    }

    @Test
    public void shouldReturn2forLimit2() {
        assertThat(2).isEqualTo(euler2.calculateSumOfEvenFibonacciElements(2));
    }
}
