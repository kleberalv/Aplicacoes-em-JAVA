package herancaPessoa;

public class Aluno extends Pessoa{

private String curso;    

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
 
    public Aluno(String codigo, String nome, int idade, String curso){
        super(codigo, nome, idade);
        this.curso=curso;
    }
    
    public String toString(){
        return "\nDados do Aluno:"+
                "\nCódigo: "+getCodigo()+
                "\nNome: "+getNome()+
                "\nIdade: "+getIdade()+
                "\nCurso: "+getCurso();
    }
}
