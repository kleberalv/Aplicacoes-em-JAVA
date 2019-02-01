package herancaassociacao;

public class Cachorro {
    
    private String nome;
    private String raca;
    private Tratador tratador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Tratador getTratador() {
        return tratador;
    }

    public void setTratador(Tratador tratador) {
        this.tratador = tratador;
    }
    
    public Cachorro(String nome, String raca, Tratador tratador){        
        this.nome=nome;
        this.raca=raca;
        this.tratador=tratador;
        
    }
    
}
