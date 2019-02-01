package Produtos;
public class Endereco {
    
    private String rua;
    private int numero;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Endereco(String rua, int numero){
        this.numero=numero;
        this.rua=rua;       
    }
    
    public String toString(){
        return  "\n ---- Endereço ----"+
                "\n Rua: "+getRua()+
                "\n Número: "+getNumero();
    }
    
}
