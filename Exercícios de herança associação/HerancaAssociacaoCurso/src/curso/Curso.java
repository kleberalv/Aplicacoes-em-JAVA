package curso;

public class Curso {
    
private int codigo;
private String nome;
private Aluno aluno;
private Disciplina disciplina;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
        
    public Curso(int codigo, String nome, Aluno aluno, Disciplina disciplina){
      this.aluno=aluno;
      this.disciplina=disciplina;
      this.codigo=codigo;
      this.nome=nome;
    }
    
}
