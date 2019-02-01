package curso;

public class DeInformatica extends Curso{
    
private int duracao;


    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
     public DeInformatica(int codigo, String nome, Aluno aluno, Disciplina disciplina, int duracao) {
        super (codigo, nome, aluno, disciplina);
        this.duracao=duracao;
        
    } 
     
      public String toString(){
        return  "\n  -----Curso de informática-----  "+
                "\nCodigo: "+getCodigo()+
                "\nNome do curso: "+getNome()+
                "\n "+getAluno()+
                "\n"+getDisciplina()+
                "\nDuração: "+getDuracao();
    }
    
}
