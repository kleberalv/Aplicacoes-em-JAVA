package herancaassociacao;

public class Equino extends Galpao{
    
    private String descricao;
    private int qtdAnimal;
    private AnimalEquino animalEquino;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdAnimal() {
        return qtdAnimal;
    }

    public void setQtdAnimal(int qtdAnimal) {
        this.qtdAnimal = qtdAnimal;
    }

    public AnimalEquino getAnimalEquino() {
        return animalEquino;
    }

    public void setAnimalEquino(AnimalEquino animalEquino) {
        this.animalEquino = animalEquino;
    }
    
    public Equino(String descricao, int qtdAnimal, AnimalEquino animalEquino, int numero, Double largura, Double comprimento, Expositor expositor, Visitante visitante){
        super(numero, largura, comprimento, expositor, visitante);
        this.descricao=descricao;
        this.qtdAnimal=qtdAnimal;
        this.animalEquino=animalEquino;
    }
    
}
