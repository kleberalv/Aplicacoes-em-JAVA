package banco;

public class Fisica extends Pessoa{
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Fisica(String cpf, Double saldo, String nome, String telefone, Double limite, Double valorGasto, Conta conta, Endereco endereco, CartaoCredito cartaoCredito){
        super(saldo, nome, telefone, limite, valorGasto, conta, endereco, cartaoCredito);
        this.cpf=cpf;       
    }
    
    public static Double saldoAtual(){
        return saldo-valorGasto;
    }
    
    public String toString(){
        return  "\n ----Dados pessoa Física ----"+
                "\n CPF: "+getCpf()+
                "\n Saldo atual: "+saldoAtual()+
                "\n nome: "+getNome()+
                "\n Telefone: "+getTelefone()+
                "\n Limíte: "+getLimite()+
                "\n Valor gasto: "+getValorGasto()+
                "\n "+getConta()+
                "\n "+getEndereco()+
                "\n "+getCartaoCredito();
    }
    
    
}
