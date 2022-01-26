package entities;

public class ArraydeObjClass {
    private String nomedoProduto;
    private Double valor;

    public ArraydeObjClass(String nomedoProduto, Double valor){
        this.nomedoProduto = nomedoProduto;
        this.valor = valor;
    }

    public String getNomedoProduto() {
        return nomedoProduto;
    }

    public void setNomedoProduto(String nomedoProduto) {
        this.nomedoProduto = nomedoProduto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }    
}
