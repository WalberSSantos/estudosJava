package entities;

public class ProdutoClass {
    public String name;
    public double price;
    public int quantity;

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
