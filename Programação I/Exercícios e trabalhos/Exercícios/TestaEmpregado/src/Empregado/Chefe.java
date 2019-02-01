package Empregado;
public class Chefe extends Empregado{

    
    public Chefe(String nome, String cpf, String data_nasc, String conta, String agencia, Double salarioBase) {
        super(nome, cpf, data_nasc, conta, agencia, salarioBase);
    }

    @Override
    public Double receberSalario() {
        return this.getSalarioBase()+(this.getSalarioBase()*0.03);
    }
 
    public String toString(){
        return  "\n    ---- Dados Bancarios do chefe----"+
                "\n Nome: "+getNome()+
                "\n CPF: "+getCpf()+
                "\n Data de nascimento: "+getData_nasc()+
                "\n Conta: "+getConta()+
                "\n Agência: "+getAgencia()+
                "\n Salário base: "+getSalarioBase()+
                 "\n    ---- Salário do Chefe: ----"+
                "\n Salário final: "+receberSalario();
    }
    
    
}
