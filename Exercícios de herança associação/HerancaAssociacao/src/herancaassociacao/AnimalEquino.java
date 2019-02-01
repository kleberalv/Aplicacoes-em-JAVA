package herancaassociacao;

public class AnimalEquino {
    
    private String raca;
    private String sexo;
    private Racao racao;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Racao getRacao() {
        return racao;
    }

    public void setRacao(Racao racao) {
        this.racao = racao;
    }
    
    public AnimalEquino(String raca, String sexo, Racao racao){
        this.raca=raca;
        this.sexo=sexo;
        this.racao=racao;
        
    }
    
}
