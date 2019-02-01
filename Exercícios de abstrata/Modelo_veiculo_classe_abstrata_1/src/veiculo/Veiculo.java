package veiculo;
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
    
    public Double Ipva(){
        return preco*0.03;        
    }
    
    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
    public Veiculo(String placa, int ano, String cor, Double preco, Proprietario proprietario){
        this.proprietario=proprietario;
        this.placa=placa;
        this.ano=ano;
        this.cor=cor;
        this.preco=preco;      
    }
    

    public abstract String toString();

    
}
