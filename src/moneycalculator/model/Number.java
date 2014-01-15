package moneycalculator.model;

public class Number {

    private long numerator;
    private long denominator;

    public Number(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public Number(long number) {
        this(number, 1);
    }

    public Number(double number) {
        numerator = (long) number;
        denominator = 1;
        while (numerator != (number * denominator)) {
            denominator = denominator * 10;
            numerator = (long) (number * denominator);
        }
        reduce();
    }

    public Number(Number number) {
        this(number.numerator, number.denominator);
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    private void reduce() {
        int[] primeNumbers = getPrimeNumbers();
        for (int primeNumber : primeNumbers) {
            while (isReducible(primeNumber)) {
                numerator /= primeNumber;
                denominator /= primeNumber;
            }
        }
    }

    private int[] getPrimeNumbers() {
        return new int[]{2, 3, 4, 5, 7, 11, 13, 17, 23};
    }

    private boolean isReducible(int primeNumber) {
        return (numerator % primeNumber == 0) && (denominator % primeNumber == 0);
    }

    public Number add(Number number) {
        if (denominator == number.denominator) {
            return new Number(numerator + number.numerator, denominator);
        }
        Number addNumber = new Number((denominator * number.denominator) / (denominator) * numerator
                + (denominator * number.denominator) / (number.denominator) * numerator,
                denominator * numerator);
        return addNumber;
    }

    public Number subtract(Number number) {
        if (denominator == number.denominator) {
            return new Number(numerator + number.numerator, denominator);
        }
        Number subtractNumber = new Number((denominator * number.denominator) / (denominator) * numerator
                - (denominator * number.denominator) / (number.denominator) * numerator,
                denominator * numerator);
        return subtractNumber;
    }

    public Number multiply(Number number) {
        return new Number(numerator * number.numerator, denominator * number.denominator);
    }

    public Number divide(Number number) {
        Number divideNumber = new Number(numerator * number.denominator, denominator * number.numerator);
        return divideNumber;
    }
    
    @Override
    public String toString() {
        String string = "";
        return string + ((double) getNumerator() / (double) getDenominator());
    }
}
