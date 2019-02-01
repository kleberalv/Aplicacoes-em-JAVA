package herancaVeiculo;

public class Moto extends Veiculo{
    
private double Cilindrada;    

    public double getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(double Cilindrada) {
        this.Cilindrada = Cilindrada;
    }
    
    public Moto(int QtdRodas, int Ano, String Cor, String Placa, double Cilindrada){
    super(QtdRodas, Ano, Cor, Placa);
    this.Cilindrada= Cilindrada;
    }
 
    public String toString(){
    return "\n--- DADOS DA MOTO ---"+
            "\nQuantidade de rodas: "+getQtdRodas()+
            "\nAno: "+getAno()+
            "\nCor: "+getCor()+
            "\nPlaca: "+getPlaca()+
            "\nCilindradas: "+getCilindrada();
    }
}
