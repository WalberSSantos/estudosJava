package entities;

public class CalculoFolha {
    private int cod;
    private String nomeFuncionario;
    private double salarioBruto;
    private double adNoturno;
    private double salarioLiquido;
    private double inss;
    private double fgts;
    private double horaExtra;

    public CalculoFolha() {
    }

    public CalculoFolha(int cod, String nomeFuncionario, double salarioBruto, double horaExtra) {
        this.cod = cod;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioBruto = salarioBruto;
        
        this.horaExtra = horaExtra;
    }

    public int getCod() {
        return cod;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getAdNoturno() {
        return adNoturno;
    }

    public void setAdNoturno(char adNoturno) {
        this.adNoturno = adNoturno;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public double getInss() {
        return inss;
    }

    public double getFgts() {
        return fgts;
    }

    public double getQtHoraExta() {
        return horaExtra;
    }

    public void setQtHoraExta(int qtHoraExta) {
        this.horaExtra = qtHoraExta;
    }

    public double adNoturno() {
        return adNoturno = salarioBruto * 0.05;
    }
    
    public double inss(){
        if (salarioBruto < 1100){
            return inss = salarioBruto * 0.075;
        }
        else if (salarioBruto < 2203.48){
            return inss = salarioBruto * 0.09;
        }
        else if (salarioBruto < 3305.22){
            return inss = salarioBruto * 0.12;
        }
        else{
            return inss = salarioBruto * 0.14;
        }
    }

    public double horaExtra(int horaExtra){
        return this.horaExtra = salarioBruto * horaExtra * 0.02;
    }

    public double calcSalarioLiq(){
        return salarioLiquido = salarioBruto - inss + adNoturno + horaExtra;
    }
    
    public String toString(){
        return "Código do Funcionário: "
        + cod
        + ", Nome: " 
        + nomeFuncionario
        + ", Salário Bruto R$: " 
        + String.format("%.2f", salarioBruto) 
        + ", Adicional Noturno R$: " 
        + String.format("%.2f", adNoturno)
        + ", Desconto do INSS R$: " 
        + String.format("%.2f", inss)
        + ", Horas Extras: "
        + String.format("%.2f", horaExtra)
        + ", Salário Líquido: "
        + String.format("%.2f", salarioLiquido);
    }
}
