package Pcte1;
import Pcte2.Motor;
public class Veiculo {
    
private String marca;
private String cor;
private double precoAcess;

Motor moto= new Motor();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPrecoAcess() {
        return precoAcess;
    }

    public void setPrecoAcess(double precoAcess) {
        this.precoAcess = precoAcess;
    }

    public Motor getMoto() {
        return moto;
    }

    public void setMoto(Motor moto) {
        this.moto = moto;
    }

    public void pinta (String v1){ 
        System.out.println("Informa a nova cor desejada: ");
        this.setCor(cor);
    }        
 
        public double preTotal(){
        return this.precoAcess + this.moto.getPreMotor();
    }

    public String toString(){
        
        return "Marca: "+this.marca+
                "\nCor: "+this.cor+
                "\nPreço dos acessorios: "+this.precoAcess+
                "\nValor total é: "+preTotal();
    }
    
}



