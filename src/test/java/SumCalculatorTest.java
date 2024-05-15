import org.example.SumCalculator;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class SumCalculatorTest {

    private SumCalculator calculator;

    @BeforeEach
    public void createCalculator() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumN1() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    public void testSumN3() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    public void testSumN0() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(0);
        });
    }
}
