
package ModificadorEstatico;
public class Auditor extends Funcionario{
    private Double gratificacao;
    private Auditor auditor;

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Auditor getAuditor() {
        return auditor;
    }

    public void setAuditor(Auditor auditor) {
        this.auditor = auditor;
    }
    public Auditor(Double gratificacao, Auditor auditor,int matricula, String nome, Double salario, Endereco endereco){
        super(matricula,nome, salario,endereco);
        this.auditor=auditor;
        this.gratificacao=gratificacao;
    }
   public Double calculaSalario() {
      return salario+ (salario*gratificacao)+gratificacao; 
   }
    
}
