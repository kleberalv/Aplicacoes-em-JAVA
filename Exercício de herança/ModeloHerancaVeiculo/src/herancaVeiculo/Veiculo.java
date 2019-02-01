package herancaVeiculo;

public class Veiculo {
    
private int QtdRodas;
private int Ano;
private String Cor;
private String Placa;

    public int getQtdRodas() {
        return QtdRodas;
    }

    public void setQtdRodas(int QtdRodas) {
        this.QtdRodas = QtdRodas;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public Veiculo(int QtdRodas, int Ano, String Cor, String Placa){
    this.QtdRodas=QtdRodas;
    this.Ano= Ano;
    this.Cor= Cor;
    this.Placa= Placa;
    }
    
    
}
