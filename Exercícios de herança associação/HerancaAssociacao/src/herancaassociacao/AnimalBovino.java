package herancaassociacao;

public class AnimalBovino {
    
    private String raca;
    private int idade;
    private Racao racao;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Racao getRacao() {
        return racao;
    }

    public void setRacao(Racao racao) {
        this.racao = racao;
    }
    
    public AnimalBovino(String raca, int idade, Racao racao){
        this.raca=raca;
        this.idade=idade;
        this.racao=racao;
        
    }
    
}
