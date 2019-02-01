package bancoheranca;

public class Especial extends Conta {
    private double limite;
    
    public Especial(int nConta, String nome, double limite){
        super(nConta, nome);
        this.limite=limite;
    
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String toString() {
        return super.toString()+ "\nlimite= "+limite;
    }    
    
        
}
