
package AssociacaoSupermercado;
public class Cep {
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Cep(String numero){
        this.numero=numero;
    }
    public String toString(){
        return "\n Número:" +getNumero();
    }
    
}
