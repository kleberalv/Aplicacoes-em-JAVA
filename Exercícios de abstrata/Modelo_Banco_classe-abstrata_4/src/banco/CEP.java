package banco;

public class CEP {
    
    private String numero;

    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public CEP(String numero){
        this.numero=numero;
    }
    
    @Override
    public String toString(){
        return  "\n ---- CEP ----"+
                "\n Número: "+getNumero();
    }
    
}
