package entities;

public class LocacaoClass {
    private String nome;
    private String email;
    private Integer nQuarto;

    public LocacaoClass(String nome, String email, Integer nQuarto) {
        this.nome = nome;
        this.email = email;
        this.nQuarto = nQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getnQuarto() {
        return nQuarto;
    }

    public void setnQuarto(Integer nQuarto) {
        this.nQuarto = nQuarto;
    }

    public String toString(){
        return "Nome: " + getNome()
        + " Email: " + getEmail();
    }
}
