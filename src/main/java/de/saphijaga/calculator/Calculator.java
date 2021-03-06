package de.saphijaga.calculator;

/**
 * Created by samuel on 24.04.16.
 */
public class Calculator {
    public double add(double value1, double value2) {
        return value1 + value2;
    }

    public double sub(double value1, double value2) {
        return value1 - value2;
    }

    public double mul(double value1, double value2) {
        return value1 * value2;
    }

    public double div(double value1, double value2) {
        if (value2 == 0)
            throw new IllegalArgumentException("Divide by zero is not allowed!");
        return value1 / value2;
    }
}
