package entities;

public final class RaioClass {
    public static final double PI = 3.14159;

    public static double circunf(double raio){
        return 2 * raio * PI;
    }
    
    public static double volume(double raio){
        return 4 * PI * Math.pow(raio, 3)/ 3;
    }
}
