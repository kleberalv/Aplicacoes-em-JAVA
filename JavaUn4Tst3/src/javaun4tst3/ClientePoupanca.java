package javaun4tst3;
public class ClientePoupanca extends ClienteConta {
    
private float taxajuros;   

    public float getTaxajuros() {
        return taxajuros;
    }

    public void setTaxajuros(float taxajuros) {
        this.taxajuros = taxajuros/100;
    }

    public void CorrigePoupanca(){
    double saldo = 0;
    double p;    
      saldo= this.getSaldo();
      p= saldo*1.10;
    }
    
    @Override
    public String toString() {
        return "\nNome: "+this.getNome()+
                "\nNúmero da conta: "+this.getConta()+
                "\nSaldo: "+this.getSaldo()+
                "\nTaxa de juros: "+this.taxajuros+
                "\nSaldo corrigido pelo percentual de juros";
    }
 

}

/**
 * RN3: O cliente Poupança só pode sacar da sua conta , 
 * quando seu saldo atingir R$2.000,00, caso ele tente um saque e o saldo ainda não atingiu este valor , 
 * uma mensagem deve ser dada “Saque não efetuado, seu saldo é inferior ao valor  exigido para saque”
 * RN4: O cliente Poupança tem seu saldo corrigido mensalmente por uma taxa de juros a ser definida pelo Banco. 
 */
