package Heranca;

public class Empregado extends Pessoa {

double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n*****Dados da Pessoa*****"
                + "\nNome: "+this.getNome()
                + "\nIdade: "+this.getIdade()
                + "\nCodigo: "+this.getCodigo()
                + "\nSalário: "+this.getSalario();
    }

    
}
