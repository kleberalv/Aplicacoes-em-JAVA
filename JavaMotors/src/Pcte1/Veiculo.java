package Pcte1;
import Pcte2.Motor;
public class Veiculo {
    public Motor moto = new Motor("",0);
    
private String marca;
private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Veiculo(String marca) {
        this.marca = marca;
    }    

    @Override
    public String toString() {
        return "Marca do veículo: "+this.getMarca()
                + "\nAno do veículo: "+this.ano;
    }  
}
