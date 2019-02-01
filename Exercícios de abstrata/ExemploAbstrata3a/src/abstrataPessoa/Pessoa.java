package abstrataPessoa;

public abstract class Pessoa {
    
private String nome;
private int idade;
private String endereco;
private Filiacao filiacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    public Pessoa(String nome, int idade, String endereco, Filiacao filiacao){
    this.nome=nome;
    this.idade=idade;
    this.endereco=endereco;
    this.filiacao=filiacao;
    }
    

    public abstract String toString();
    
    
    
}
