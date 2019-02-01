package curso;

public class DeEletronica extends Curso{
    
  private int qtdDisciplina;
  private Coordenador coordenador;


    public int getQtdDisciplina() {
        return qtdDisciplina;
    }

    public void setQtdDisciplina(int qtdDisciplina) {
        this.qtdDisciplina = qtdDisciplina;
    }
    
    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }
    
      public DeEletronica(int codigo, String nome, Aluno aluno, Disciplina disciplina, int qtdDisciplina, Coordenador coordenador) {
        super(codigo, nome, aluno, disciplina);
        this.qtdDisciplina=qtdDisciplina;
        this.coordenador=coordenador;
      }
      
      public String toString(){
        return  "\n  -----Curso de Eletrônica-----  "+
                "\nCodigo: "+getCodigo()+
                "\nNome do curso: "+getNome()+
                "\n"+getAluno()+
                "\n"+getDisciplina()+
                "\nDuração: "+getQtdDisciplina()+
                "\n"+getCoordenador();
    }   
    
}
