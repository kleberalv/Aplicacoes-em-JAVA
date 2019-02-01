package AssociacaoVeiculo;

public class Roda {
    
    private int aro;
    private int qtdParafusos;

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public int getQtdParafusos() {
        return qtdParafusos;
    }

    public void setQtdParafusos(int qtdParafusos) {
        this.qtdParafusos = qtdParafusos;
    }
    
 public Roda(int aro, int qtdParafusos){
  this.aro=aro;
  this.qtdParafusos=qtdParafusos;
 }   
public String toString(){
  return "\n---Dados da roda ---"+
          "\nAro: "+getAro()+
          "\nQuantidade de parafusos: "+getQtdParafusos();  
    
}    
    
}
