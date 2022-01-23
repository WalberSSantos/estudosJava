package entities;

public class BoletimClass {
 

    public double nota1, nota2, nota3;
    public String nome;

    public double media(){
        return (nota1 + nota2 + nota3);
    }

    public double diferenca(){
       if (media() < 60){
           return 60 - media();
       }
       else{
           return 0.0;
       }
    }
}
