package de.saphijaga.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by samuel on 24.04.16.
 */
public class CalculatorTest {
    private static final double DELTA = 0.001;

    private static final double VALUE_1 = 34.65;
    private static final double VALUE_2 = 69.57;
    private static final double VALUE_3 = 45.36;
    private static final double VALUE_4 = 54.78;

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void shouldAdd() throws Exception {
        assertEquals(104.22, calculator.add(VALUE_1, VALUE_2), DELTA);
    }

    @Test
    public void shouldAddAnother() throws Exception {
        assertEquals(100.14, calculator.add(VALUE_3, VALUE_4), DELTA);
    }

    @Test
    public void shouldSub() throws Exception {
        assertEquals(-34.92, calculator.sub(VALUE_1, VALUE_2), DELTA);
    }

    @Test
    public void shouldSubAnother() throws Exception {
        assertEquals(-9.42, calculator.sub(VALUE_3, VALUE_4), DELTA);
    }

    @Test
    public void shouldMul() throws Exception {
        assertEquals(2410.6005, calculator.mul(VALUE_1, VALUE_2), DELTA);
    }

    @Test
    public void shouldMulAnother() throws Exception {
        assertEquals(2484.8208, calculator.mul(VALUE_3, VALUE_4), DELTA);
    }

    @Test
    public void shouldDiv() throws Exception {
        assertEquals(0.498059508, calculator.div(VALUE_1, VALUE_2), DELTA);
    }

    @Test
    public void shouldDivAnother() throws Exception {
        assertEquals(0.82803943, calculator.div(VALUE_3, VALUE_4), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowDivByZeroError() throws Exception {
        calculator.div(VALUE_1, 0);
    }
}
