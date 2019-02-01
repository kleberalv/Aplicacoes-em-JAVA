package ContaPoupança;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;
    
    
    public Conta(int numero, double saldo){
        this.numero=numero;
        this.saldo=saldo;     
    }
public double ReajustaPoup(double tx){
    
    return saldo*(tx/100);
}

public void setNumero(int numero){
    this.numero = numero;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



}
