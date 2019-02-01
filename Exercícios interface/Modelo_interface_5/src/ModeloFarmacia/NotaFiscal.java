package ModeloFarmacia;
public abstract class NotaFiscal {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public NotaFiscal(int numero){
        this.numero=numero;
    }
    
    public abstract String toString();
    
}
