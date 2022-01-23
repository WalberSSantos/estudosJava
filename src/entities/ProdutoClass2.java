package entities;

public class ProdutoClass2 {
    private String name;
    private double price;
    private int quantity;

    /* CONTRUTOR - P A D R Ã O */
    
    
    public ProdutoClass2(){

    }

    /* CONTRUTOR - P E R S O N A L I Z A D O */
    public ProdutoClass2(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /* CONTRUTOR - S O B R E C A R G A */
   
    public ProdutoClass2(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double TotalValueStock() {
        return price * quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "Dados do Produto: "
                + name
                + " $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " unidades, Total: $ "
                + String.format("%.2f", TotalValueStock());
    }

}
