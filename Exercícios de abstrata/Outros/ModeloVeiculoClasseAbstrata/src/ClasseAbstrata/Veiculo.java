
package ClasseAbstrata;

import java.text.DecimalFormat;

public abstract class Veiculo {
    DecimalFormat df = new DecimalFormat("R$: ##.00");
    private String placa;
    private int ano;
    private String cor;
    protected Double preco;
    private Proprietario proprietario;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    public abstract Double ipva();
    
    public abstract Double seguro();
    
    public abstract String toString();
    
    public Veiculo(String placa, int ano, String cor, Double preco, Proprietario proprietario){
        this.ano=ano;
        this.cor=cor;
        this.placa=placa;
        this.preco=preco;
        this.proprietario=proprietario;
    }
    
    
}
