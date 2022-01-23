package entities;

public class FuncionarioClass {
    public String nome;
    public double salarioBruto, desconto;

    public double salarioLiquido(){
        return salarioBruto - desconto;
    }

    public void salarioIncrementado(double porcentagem){
       salarioBruto += salarioBruto * porcentagem /100;
    }

    public String toString(){
        return nome +
        ", R$ " +
        String.format("%.2f", salarioLiquido());
    }
}
