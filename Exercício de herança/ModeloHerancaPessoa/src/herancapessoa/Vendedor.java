package herancapessoa;

public class Vendedor extends Pessoa{
    
private int matr;
private Double salario;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Vendedor(String Nome, String Endereco, int matr, Double salario){
        super(Nome, Endereco);
        this.matr= matr;
        this.salario= salario;
        
    }
    
}
