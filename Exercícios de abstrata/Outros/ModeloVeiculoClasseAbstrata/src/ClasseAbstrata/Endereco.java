
package ClasseAbstrata;
public class Endereco {
    private String rua;
    private String numero;

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Endereco(String rua, String numero){
        this.numero=numero;
        this.rua=rua;
    }
    public String toString(){
        return  "\n Rua:" +getRua()+
                "\n Número:" +getNumero();
               
    }
    
}
