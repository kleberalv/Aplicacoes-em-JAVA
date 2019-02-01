package exemploPessoa;
public class Professor extends Pessoa implements Imprimivel,EstadoOrigem {
    
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public Professor(String nome, Double salario, String titulo){
        super(nome,salario);
        this.titulo=titulo;
    }
    
    public Double calculaSalario(){
        return salario+gratificacao;
    }
    
    public String toString(){
        return  "\n ---- Dados do professor ----"+
                "\n Nome: "+getNome()+
                "\n Salário: "+getSalario()+
                "\n Título: "+getTitulo()+
                "\n Cidade: "+cidade+
                "\n Estado: "+estado+
                "\n Valor do salário: "+calculaSalario();
        
    }
}
