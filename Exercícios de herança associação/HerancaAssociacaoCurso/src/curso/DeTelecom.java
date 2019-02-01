package curso;

public class DeTelecom extends Curso{
    
  private String coordenador;  

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
  
    public DeTelecom(int codigo, String nome, Aluno aluno, Disciplina disciplina, String coordenador){
        
      super(codigo, nome, aluno, disciplina);
      this.coordenador=coordenador;
        
    }
    
      public String toString(){
        return  "\n  -----Curso de Telecomunicação-----  "+
                "\nCodigo: "+getCodigo()+
                "\nNome do curso: "+getNome()+
                "\n"+getAluno()+
                "\n"+getDisciplina()+
                "\nDuração: "+getCoordenador();
    }
    
    
    
}
