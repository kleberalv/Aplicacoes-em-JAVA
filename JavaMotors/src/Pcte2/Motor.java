package Pcte2;
public class Motor {
    
 private String fab;
 private double preco;

    public String getFab() {
        return fab;
    }

    public void setFab(String fab) {
        this.fab = fab;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Motor(String fab, double preco) {
        this.fab = fab;
        this.preco = preco;
    }  

    @Override
    public String toString() {
        return "Motor: ";
    }
    
}
