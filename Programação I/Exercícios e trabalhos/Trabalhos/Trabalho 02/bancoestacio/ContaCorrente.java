
package bancoestacio;


public class ContaCorrente {
    
    private int numero;
    private String titular;
    private String cpf;
    private double saldo;
    private double limite;

    public ContaCorrente(){}
    
    public ContaCorrente(int numero, String titular, String cpf, double saldo, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.cpf = cpf;
        this.saldo = saldo;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void saca(double valor) {
        if(this.saldo < valor && this.saldo > this.limite) {
                System.out.println("Saldo insuficiente ou valor maior que limite!"); 
        }else
                this.saldo -= valor; 
    }
    
   public void deposita(double valor) {     
       this.saldo += valor;
   }

   public void transfere (double valor, ContaCorrente destino){
       if(this.saldo < valor){
           System.out.println("Saldo insuficiente!");
       }else{ 
              this.saca(valor);
              destino.deposita(valor);
              System.out.println("Seu saldo atual é: " + this.saldo);
              System.out.println("Saldo da conta destino: " + destino.saldo);
            }
       }
   
   public void aumentaLimite(double valor){
       this.limite += valor;
       System.out.println("Limite atual: " + this.limite);
       System.out.println("Saldo atual: " + this.saldo);     
   }
     
    @Override
    public String toString() {
        return "Titular da conta: " + this.titular
                + "\nNúmero da conta: " + this.numero
                    +"\nCPF do títular: " + this.cpf
                        +"\nSaldo da conta: " + this.saldo
                            +"\nLimite atual da conta: " + this.limite;

   
   
}
}
