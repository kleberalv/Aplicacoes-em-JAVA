package Produtos;
import java.text.DecimalFormat;

public abstract class Pessoa {
    
    DecimalFormat df = new DecimalFormat("##.00");
    
    private String nome;
    protected Double altura;
    protected Double peso;
    protected int anoNasc;
    protected int anoAtual;
    private Endereco Endereco;
    
    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }
    
    public Pessoa(String nome, Double altura, Double peso, int anoNasc, int anoAtual, Endereco Endereco){
    this.Endereco=Endereco;  
    this.nome=nome;
    this.altura=altura;
    this.peso=peso;
    this.anoNasc=anoNasc;
    this.anoAtual=anoAtual;
    }
    
    public abstract Double pesoIdeal();
    public abstract int idade();
    public abstract String toString();

  
}
