package exercicio;

public class Pessoa {
    
    private String nome;
    private String corCabelos;
    private int corOlhos;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorCabelos() {
        return corCabelos;
    }

    public void setCorCabelos(String corCabelos) {
        this.corCabelos = corCabelos;
    }

    public int getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(int corOlhos) {
        this.corOlhos = corOlhos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String corCabelos, int corOlhos, int idade, String sexo){
        this.nome=nome;
        this.corCabelos=corCabelos;
        this.corOlhos=corOlhos;
        this.idade=idade;
        this.sexo=sexo;
        
    }    
    
    public String toString(){
        return "\n ---- Dados Pessoa ---- "+
                "\n Nome: "+getNome()+
                "\n Cor dos cabelos: "+getCorCabelos()+
                "\n Idade: "+getIdade()+
                "\n Sexo: "+getSexo();
    }
    
}
