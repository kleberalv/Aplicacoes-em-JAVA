package ModeloFarmacia;
public abstract class Funcionario {
    
    private String matr;
    private String nome;
    private Double salario;
    private Endereco endereco;
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Funcionario(String matr, String nome, Double salario, Endereco endereco){
        this.matr=matr;
        this.nome=nome;
        this.salario=salario;
        this.endereco=endereco;
    }
    
    public abstract Double inss();
    
    public abstract String toString();

}
