package entities;

public class ConverterDolarClass {
    public static final double IOF = 0.06;

    public static double converterDolar(double valorDoDollar, double montante){
        return montante * valorDoDollar * (1 + IOF);
    }
}
