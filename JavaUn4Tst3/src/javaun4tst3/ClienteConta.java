package javaun4tst3;
import java.text.DecimalFormat;
public class ClienteConta {
    DecimalFormat df = new DecimalFormat("0.00");
    
private String nome;
private String conta;
private double Saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    
    public void deposita(double v){
        
        
    }
    
    public void saca(double v){
        
    }
    
public void ClienteConta(String nome, String conta, double saldo){
    
}

    @Override
    public String toString() {
        return "\nNome: "+this.getNome()+
                "\nNúmero da conta: "+this.getConta()+
                "\nSaldo: "+this.getSaldo();
    }

}
