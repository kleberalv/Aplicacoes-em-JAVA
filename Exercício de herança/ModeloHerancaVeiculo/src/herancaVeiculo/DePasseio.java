package herancaVeiculo;

public class DePasseio extends Carro{

private int QtdPassageiros;

    public int getQtdPassageiros() {
        return QtdPassageiros;
    }

    public void setQtdPassageiros(int QtdPassageiros) {
        this.QtdPassageiros = QtdPassageiros;
    }
    
public DePasseio(int QtdRodas, int Ano, String Cor, String Placa, int QtdPortas, String Marca, int QtdPassageiros){
    super(QtdRodas, Ano, Cor, Placa, QtdPortas, Marca);
    this.QtdPassageiros=QtdPassageiros;
    
}  
    
    
public String toString(){
    return "\n--- DADOS DO CARRO DE PASSEIO ---"+
            "\nQuantidade de rodas: "+getQtdRodas()+
            "\nAno: "+getAno()+
            "\nCor: "+getCor()+
            "\nPlaca: "+getPlaca()+
            "\nQuantidade de passageiros: "+getQtdPassageiros();
} 
    
}
