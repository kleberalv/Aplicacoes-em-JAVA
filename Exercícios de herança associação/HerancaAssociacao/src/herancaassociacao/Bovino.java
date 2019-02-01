package herancaassociacao;

public class Bovino extends Galpao{
    
    private String descricao;
    private AnimalBovino animalBovino;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public AnimalBovino getAnimalBovino() {
        return animalBovino;
    }

    public void setAnimalBovino(AnimalBovino animalBovino) {
        this.animalBovino = animalBovino;
    }
    
    public Bovino(String descricao, AnimalBovino animalBovino, int numero, Double largura, Double comprimento, Expositor expositor, Visitante visitante){
        super(numero, largura, comprimento, expositor, visitante);
        this.descricao=descricao;
        this.animalBovino=animalBovino;
        
    }
    
}
