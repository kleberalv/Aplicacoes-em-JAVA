package herancaassociacao;

public class Tratador {
    
    private String matr;
    private String nome;
    private Racao racao;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Racao getRacao() {
        return racao;
    }

    public void setRacao(Racao racao) {
        this.racao = racao;
    }

    public Tratador(String matr, String nome, Racao racao){
        this.matr=matr;
        this.nome=nome;
        this.racao=racao;
        
    }
}
