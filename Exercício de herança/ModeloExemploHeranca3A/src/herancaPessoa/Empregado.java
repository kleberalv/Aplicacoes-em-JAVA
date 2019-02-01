package herancaPessoa;

public class Empregado extends Pessoa {
     
private Double Salario;    

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

    public Empregado(String codigo, String nome, int idade, Double salario){
        super(codigo, nome, idade);
        this.Salario=salario;
    }
    
    public String toString(){
     return "\nDados do empregado: "+
             "\nCódigo: "+getCodigo()+
             "\nNome: "+getNome()+
             "\nIdade: "+getIdade()+
             "\nSalário: "+getSalario();   
    }
}
