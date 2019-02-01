package Banco;

public class Conta {
    
    private int numeroConta;
    private String nomeDonaConta;
    private Double saldo;
    private Double limite;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeDonaConta() {
        return nomeDonaConta;
    }

    public void setNomeDonaConta(String nomeDonaConta) {
        this.nomeDonaConta = nomeDonaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
    public Conta(){
        
    }
    
    public Conta(int NumeroConta, String nomeDonaConta, Double saldo, Double limite){
        this.numeroConta=NumeroConta;
        this.nomeDonaConta=nomeDonaConta;
        this.saldo=saldo;
        this.limite=limite;        
    }
    
    public void Depositar(double ValorDeposito){
        this.saldo= this.saldo+ ValorDeposito;
    }

    public void Sacar(double ValorSaque){
        this.saldo= this.saldo - ValorSaque;
    }
    
    public String toString(){
        return  "\n ---- Dados Bancarios ----"+
                "\n Nome do titular da conta: "+getNomeDonaConta()+
                "\n Número da conta: "+getNumeroConta()+
                "\n Saldo em conta: "+getSaldo()+
                "\n Limite: "+getLimite();
    }
    
    
}
