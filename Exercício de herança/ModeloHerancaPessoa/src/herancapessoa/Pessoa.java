package herancapessoa;

public class Pessoa {
    
private String Nome;    
    
private String Endereco;    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public Pessoa(String Nome, String Endereco) {
        this.Nome = Nome;
        this.Endereco = Endereco;
    }   
    
}
