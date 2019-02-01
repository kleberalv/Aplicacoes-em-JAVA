package herancaVeiculo;

public class Carro extends Veiculo {
  
private int QtdPortas;
private String Marca;

    public int getQtdPortas() {
        return QtdPortas;
    }

    public void setQtdPortas(int QtdPortas) {
        this.QtdPortas = QtdPortas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

public Carro(int QtdRodas, int Ano, String Cor, String Placa, int QtdPortas, String Marca){
super(QtdRodas, Ano, Cor, Placa);
this.QtdPortas= QtdPortas;
this.Marca= Marca;
   
} 

public String toString(){
    return "\n--- DADOS DO CARRO ---"+
            "\nQuantidade de rodas: "+getQtdRodas()+
            "\nAno: "+getAno()+
            "\nCor: "+getCor()+
            "\nPlaca: "+getPlaca()+
            "\nQuantide de portas: "+getQtdPortas()+
            "\nMarca: "+getMarca();
}
       
}

