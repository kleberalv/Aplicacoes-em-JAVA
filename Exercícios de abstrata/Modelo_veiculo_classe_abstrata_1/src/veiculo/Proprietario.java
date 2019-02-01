package veiculo;

public class Proprietario {
    
    private String cpf;
    private String nome;
    private Endereco endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Proprietario(String cpf, String nome, Endereco endereco){
        this.cpf=cpf;
        this.nome=nome;
        this.endereco=endereco;
    }
    
    public String toString(){
        return  "\n--- Dados proprietário ---"+
                "\n CPF: "+getCpf()+
                "\n Nome: "+getNome()+
                getEndereco();
    }
    
}
