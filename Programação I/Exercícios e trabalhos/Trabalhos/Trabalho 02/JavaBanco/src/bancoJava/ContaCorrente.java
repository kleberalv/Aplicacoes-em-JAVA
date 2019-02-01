package bancoJava;
public class ContaCorrente {
    
    protected int numeroDaConta;
    protected String nomeDonoDaConta;
    protected String cpfDoCliente;
    protected Double saldo;
    protected Double limite;
    //______________________________
    protected Double valorSaque;
    protected Double valorDeposito;
    protected Double valorTransf;
    protected Double valorLimite;
//______________________________________________________________________________
//GETs e SETs:
    
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeDonoDaConta() {
        return nomeDonoDaConta;
    }

    public void setNomeDonoDaConta(String nomeDonoDaConta) {
        this.nomeDonoDaConta = nomeDonoDaConta;
    }

    public String getCpfDoCliente() {
        return cpfDoCliente;
    }

    public void setCpfDoCliente(String cpfDoCliente) {
        this.cpfDoCliente = cpfDoCliente;
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
    
    
    public Double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(Double valorSaque) {
        this.valorSaque = valorSaque;
    }  
    
    public Double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(Double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public Double getValorTransf() {
        return valorTransf;
    }

    public void setValorTransf(Double valorTransf) {
        this.valorTransf = valorTransf;
    }  
    
    public Double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(Double valorLimite) {
        this.valorLimite = valorLimite;
    }

//______________________________________________________________________________
//Construtores:    
    public ContaCorrente(){
        
    }
    
    public ContaCorrente(int numeroDaConta, String nomeDonoDaConta, String cpfDoCliente, Double saldo, Double limite){
        this.numeroDaConta=numeroDaConta;
        this.nomeDonoDaConta=nomeDonoDaConta;
        this.cpfDoCliente=cpfDoCliente;
        this.saldo=saldo;
        this.limite=limite;
        
    }  
    
//______________________________________________________________________________
//Metodos:
        
public double Sacar(){
    
        //Não pode passar do limite de crédito;
        //Se passar do limite, mostrar uma mensagem informando.
// Double s, é uma variavel local para armazenar o resultado do calculo.
    double s;

/** Calculo para mostrar apenas o valor do saque. */
    if (this.getSaldo()>=this.getValorSaque()){
        s= (this.getSaldo()) - (this.getSaldo() - this.getValorSaque());
        return s;      
        }else{
        if(this.getValorSaque()>this.getLimite()){
            /** Caso o usuario tente sacar mais do que ele tem de limite. */
            System.out.println("SALDO INSUFICIENTE  OU LIMITE ULTRAPASSADO PARA EFETUAR O SAQUE!");            
        }else{
    
            if(this.getSaldo()<this.getValorSaque()){
            /** Caso o usuario tente sacar mais do que ele tem. */
            System.out.println("SALDO INSUFICIENTE  OU LIMITE ULTRAPASSADO PARA EFETUAR O SAQUE!");
            }
    }
    return 0;
    }
}

public double Depositar(){
    
// Double s, é uma variavel local para armazenar o resultado do calculo.
    double s;

/** Calculo para mostrar apenas o valor do deposito. */
   
//        s= (this.getSaldo() + this.getValorDeposito());     
        s= (this.getValorDeposito());     
    return s;
    }
    
    public Double Transferencia(){
        //Transferir de conta X para Y.
        //Mostrar o saldo de ambas as contas apôs a transferência. 
        Double r;
            r=(this.getSaldo()+this.getValorTransf());
        return r;
    } 
    
    public double AumentarLimite(){
    //Aumentar o limíte do cliente.    
        return limite+=0.0;
    }
    
    public Double NovoSaldo(){
        return (this.getValorDeposito()+this.getSaldo());
    }   
    
}
