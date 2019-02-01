package herancaVeiculo;

public class DeCarga extends Carro {
    
private Double Capacitade; 

    public Double getCapacitade() {
        return Capacitade;
    }

    public void setCapacitade(Double capacitade) {
        this.Capacitade = capacitade;
    }
    
    public DeCarga(int QtdRodas, int Ano, String Cor, String Placa, int QtdPortas, String Marca, Double Capacidade){
    super(QtdRodas, Ano, Cor, Placa, QtdPortas, Marca);  
    this.Capacitade= Capacidade;
    }
  
public String toString(){ 
       return "\n--- DADOS DO CARRO DE CARGA ---"+
            "\nQuantidade de rodas: "+getQtdRodas()+
            "\nAno: "+getAno()+
            "\nCor: "+getCor()+
            "\nPlaca: "+getPlaca()+
            "\nCapacidade: "+getCapacitade();   
}
    
}
