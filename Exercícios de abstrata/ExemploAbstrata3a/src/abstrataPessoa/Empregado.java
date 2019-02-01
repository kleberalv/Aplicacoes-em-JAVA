package abstrataPessoa;

public class Empregado extends Pessoa {
    
private String matr;
private String setor;
private Filiacao filiacao;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }
    
    public Empregado(String matr, String setor, String nome, int idade, String endereco, Filiacao filiacao){
        super(nome, idade, endereco, filiacao);
    
    }
    
    public String toString(){
       return "\n--Dados do empregado--"+
               "\nNome: "+getNome()+
               "\nIdade: "+getIdade()+
               "\nEndereço: "+getEndereco()+
               "\nMatricula: "+getMatr()+
               "\nSetor: "+getMatr()+
               "\nFiliação do empregado: "+getFiliacao();
    }
    
}
