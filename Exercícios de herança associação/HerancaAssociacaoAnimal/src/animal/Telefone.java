package animal;

public class Telefone {
    
 private int DDD;
 private String numero;

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
 
    public Telefone(int ddd, String numero){
      this.DDD=ddd;
      this.numero=numero;
        
    }
    
    public String toString(){
        return  "\nDDD: "+getDDD()+
                "\nNúmero: "+getNumero();
    }
 
 
}
