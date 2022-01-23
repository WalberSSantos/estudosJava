package entities;

public class RetanguloClass {
    public double larg, alt;

    public double area(){
        return larg * alt;
    }

    public double perimetro(){
        return 2*(larg + alt);
    }

    public double diagonal(){
        return Math.sqrt(larg * larg + alt * alt);
    }

    public String toString(){
        return String.format("%.2f", area());
    }
    
    
}
