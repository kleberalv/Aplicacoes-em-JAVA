package abstrataPessoa;

public class Aluno extends Pessoa{
    
private String curso;    

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Aluno(String curso, String nome, int idade, String endereco, Filiacao filiacao) {
        super(nome, idade, endereco, filiacao);
        this.curso=curso;
    }    
    
    public String toString(){
        return  "\n--Dados do aluno--"+
                "\n Nome: "+getNome()+
                "\n Idade: "+getIdade()+
                "\n Endereço: "+getEndereco()+
                "\n Curso: "+getCurso()+
                "\n Filiação do aluno: "+getFiliacao();

    }
    
}
