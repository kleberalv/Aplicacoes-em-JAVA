package herancaVeiculo;

public class Caminhao extends Veiculo {
 
private int QtdEixos;

    public int getQtdEixos() {
        return QtdEixos;
    }

    public void setQtdEixos(int QtdEixos) {
        this.QtdEixos = QtdEixos;
    }
    
public Caminhao(int QtdRodas, int Ano, String Cor, String Placa, int QtdEixos){
super(QtdRodas, Ano, Cor, Placa);
this.QtdEixos= QtdEixos;
}

public String toString(){
    return "\n--- DADOS DO CAMINHÃO ---"+
            "\nQuantidade de rodas: "+getQtdRodas()+
            "\nAno: "+getAno()+
            "\nCor: "+getCor()+
            "\nPlaca: "+getPlaca()+
            "\nQuantidade de eixos: "+getQtdEixos();
}
    
}
