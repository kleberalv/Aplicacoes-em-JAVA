package herancaassociacao;

public class Gato {
    
   private String cor;
   private String raca;
   private Tratador tratador;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Tratador getTratador() {
        return tratador;
    }

    public void setTratador(Tratador tratador) {
        this.tratador = tratador;
    }
   
   public Gato(String cor, String raca, Tratador tratador){
       this.cor=cor;
       this.raca=raca;
       this.tratador=tratador;
       
   }
    
    
}
