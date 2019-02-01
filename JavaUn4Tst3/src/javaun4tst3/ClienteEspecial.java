package javaun4tst3;
public class ClienteEspecial extends ClienteConta {
        
private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saca(){
    }

    @Override
    public String toString() {
        return "\nNome: "+this.getNome()+
                "\nNúmero da conta: "+this.getConta()+
                "\nSaldo: "+this.getSaldo();
    }   
}
