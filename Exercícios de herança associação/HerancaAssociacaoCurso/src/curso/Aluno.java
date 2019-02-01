package curso;

public class Aluno {
    
private String matr;
private String nome;
private Professor professor;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public Aluno(String matr, String nome, Professor professor){
     
  this.professor= professor;
  this.matr=matr;
  this.nome=nome;     
    }
    
      public String toString(){
        return  "\n--Dados do aluno--"+
                "\nMatricula: "+getMatr()+
                "\nNome: "+getNome()+
                "\n"+getProfessor();
    }
}
