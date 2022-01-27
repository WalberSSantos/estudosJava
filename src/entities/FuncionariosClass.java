package entities;

public class FuncionariosClass {
    Integer id;
    String nome;
    Double salario;

    public FuncionariosClass(){

    }
    public FuncionariosClass(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double calcSalario(int percentual){
        return salario += (getSalario() * percentual) / 100;
    }

    public String toString(){
        return getId()
        + ", "
        +getNome()
        + ", "
        + String.format("%.2f", getSalario());
    
    }

    

    
    
}
