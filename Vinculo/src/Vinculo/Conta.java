package Vinculo;
import Vinculo.Cliente;
import java.text.DecimalFormat;

public class Conta {

private double saldo,limite;  
Cliente dono= new Cliente();
private int numero;

DecimalFormat df= new DecimalFormat("0,00");

    public boolean Saca(double valor){
        if (valor<=saldo){
            return true;
        }else
    return false;
           
    }

    public void Depositar(double valor){
     this.saldo=this.saldo+valor;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String toString(){
        return "Número: "+numero
                  +"\nLimite: "+limite
                    +"\nSaldo: "+saldo
                      +"\n Cliente"+dono;    
    }
    
}
