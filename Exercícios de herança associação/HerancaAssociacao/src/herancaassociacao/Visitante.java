package herancaassociacao;

public class Visitante {
    
    private String nome;
    private Stand stand;
    private Ingresso ingresso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }
    
    public Visitante(String nome, Stand stand, Ingresso ingresso){
    this.nome=nome;
    this.stand=stand;
    }    
    
}
