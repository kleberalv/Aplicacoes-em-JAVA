package animal;

public class Pessoa {
    
  private String nome;
  private Telefone telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    public Pessoa(String nome, Telefone telefone){
        this.telefone=telefone;
        this.nome=nome;
        
    }
    
    
}
