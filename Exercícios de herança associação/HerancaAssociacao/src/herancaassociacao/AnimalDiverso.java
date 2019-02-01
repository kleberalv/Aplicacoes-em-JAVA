package herancaassociacao;

public class AnimalDiverso extends Galpao{
    
    private String nome;
    private Gato gato;
    private Cachorro cachorro;
    private Ovelha ovelha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Gato getGato() {
        return gato;
    }

    public void setGato(Gato gato) {
        this.gato = gato;
    }

    public Cachorro getCachorro() {
        return cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    public Ovelha getOvelha() {
        return ovelha;
    }

    public void setOvelha(Ovelha ovelha) {
        this.ovelha = ovelha;
    }
    
    public AnimalDiverso(String nome, Gato gato, Cachorro cachorro, Ovelha ovelha, int numero, Double largura, Double comprimento, Expositor expositor, Visitante visitante){
        super(numero, largura, comprimento, expositor, visitante);
        this.nome=nome;
        this.gato=gato;
        this.cachorro=cachorro;
        this.ovelha=ovelha;  
        
    }
    
}
