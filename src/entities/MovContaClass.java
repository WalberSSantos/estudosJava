package entities;

public class MovContaClass{
    private int nConta;
    private String nomeCliente;
    private double saldo;

    public MovContaClass(int nConta, String nomeCliente){
        this.nConta = nConta;
        this.nomeCliente = nomeCliente;    
    }

    public MovContaClass(int nConta, String nomeCliente, double valorDeposito){
        this.nConta = nConta;
        this.nomeCliente = nomeCliente;
        deposito(valorDeposito);
    }

  
    public int getNConta(){
        return nConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        saldo -= valor + 5.0;

    }

        public String toString(){
            return "Conta nº: " 
            + nConta
            + ", Titular: "
            + nomeCliente
            + ", Saldo R$: " 
            + String.format("%.2f", saldo);
        }
    

}