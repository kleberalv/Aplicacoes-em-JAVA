package abstrataPessoa;

public class Professor extends Pessoa{
    
private String titulo;
private String areaAtuacao;
private Filiacao filiacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }
    
    public Professor(String titulo, String areaAtuacao, String nome, int idade, String endereco, Filiacao filiacao){
        super(nome, idade, endereco, filiacao);
        this.titulo=titulo;
        this.areaAtuacao=areaAtuacao;
        this.filiacao=filiacao;             
    }
    
    public String toString(){
       return "\n--Dados do professor--"+
               "\n Nome: "+getNome()+
               "\n Idade: "+getIdade()+
               "\n Endereço: "+getEndereco()+
               "\n Titulo: "+getTitulo()+
               "\n Área de atuação: "+getAreaAtuacao()+
               "\n Filiação do professor: "+getFiliacao();
    }
  
}
