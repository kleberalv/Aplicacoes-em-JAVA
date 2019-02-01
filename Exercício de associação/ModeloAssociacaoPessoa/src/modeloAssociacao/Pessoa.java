package modeloAssociacao;

public class Pessoa {
    
private String codigo;
private String nome;
private int idade;
private Endereco endereco;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
public Pessoa(String codigo, String nome, int idade, Endereco endereco){
this.codigo=codigo;
this.nome=nome;
this.idade=idade;
this.endereco=endereco;
    
}    
    
public String toString(){
    return "\n---Dados da pessoa ---"+
            "\nCódigo: "+getCodigo()+
            "\nNome: "+getNome()+
            "\nIdade: "+getIdade()+
            "\n--- Endereço da pessoa: ---"+getEndereco();
    
}    
}
