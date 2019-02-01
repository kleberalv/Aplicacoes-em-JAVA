package bancoheranca;

public class Conta {
    private int nConta;
    private String nome;
    private double saldo;
    
    public Conta(int nConta, String nome){
        this.nConta=nConta;
        this.nome=nome;
        this.saldo=15000;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
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
    
    public void Saca(double saca){
        this.saldo=this.saldo-saca;
    }
    
    public void deposita(double deposita){
        this.saldo=this.saldo+deposita;
    }
    
        public String toString() {
        return "\nConta: "+nConta+
                "\nNome: "+nome+
                "\nSaldo: "+saldo;
    }

}
