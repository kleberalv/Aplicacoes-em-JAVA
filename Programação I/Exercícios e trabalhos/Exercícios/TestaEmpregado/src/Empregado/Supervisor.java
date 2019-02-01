package Empregado;
public class Supervisor extends Empregado{

    
    public Supervisor(String nome, String cpf, String data_nasc, String conta, String agencia, Double salarioBase) {
        super(nome, cpf, data_nasc, conta, agencia, salarioBase);
    }

    @Override
    public Double receberSalario() {
        return this.getSalarioBase()+(this.getSalarioBase()*0.05);
    } 
    
    
    public String toString(){
        return  "\n    ---- Dados Bancarios do supervisor ----"+
                "\n Nome: "+getNome()+
                "\n CPF: "+getCpf()+
                "\n Data de nascimento: "+getData_nasc()+
                "\n Conta: "+getConta()+
                "\n Agência: "+getAgencia()+
                "\n Salário base: "+getSalarioBase()+
                 "\n    ---- Salário do Supervisor: ----"+
                "\n Salário final: "+receberSalario();
    }
}
