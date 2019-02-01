package herancaassociacao;

public class Expositor {
    
    private String codigo;
    private String nome;
    private Stand stand;

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

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }
    
    public Expositor(String codigo, String nome, Stand stand){
        this.codigo=codigo;
        this.nome=nome;
        this.stand=stand;
        
    }
    
}
