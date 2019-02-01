package herancapessoa;

public class Cliente extends Pessoa {
 
private int idade;   

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cliente(String Nome, String Endereco, int idade) {
        super(Nome, Endereco);
        this.idade = idade;
    }
        
}
