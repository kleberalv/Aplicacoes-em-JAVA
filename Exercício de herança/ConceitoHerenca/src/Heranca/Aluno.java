package Heranca;

public class Aluno extends Pessoa {
    
String curso;   


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "\n*****Dados da Pessoa *****"
                + "\nNome: "+this.getNome()
                + "\nIdade: "+this.MostrarIdade()
                + "\nCodigo: "+this.getCodigo()
                + "\nCurso: "+this.getCurso();
    }
    
}
