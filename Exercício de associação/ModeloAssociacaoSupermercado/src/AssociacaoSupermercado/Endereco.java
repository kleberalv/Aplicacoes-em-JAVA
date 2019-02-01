
package AssociacaoSupermercado;
public class Endereco {
    private String rua;
    private String numero;
    private Cep cep;

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

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }
    public Endereco(String rua, String numero, Cep cep){
        this.cep=cep;
        this.rua=rua;
        this.numero=numero;
    }
    public String toString(){
        return "\n CEP" +getCep()+
                "\n Rua:" +getRua()+
                "\n Numero:" +getNumero();
    }
    
}
