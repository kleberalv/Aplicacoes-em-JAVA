package AssociacaoVeiculo;

public class Veiculo {
    
private Porta porta;
private String placa;
private String cor;
private Motor motor;
private Roda roda;

    public Porta getPorta() {
        return porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

public Veiculo(String placa, String cor, Porta porta, Motor motor, Roda roda){
    this.cor=cor;
    this.placa=placa;
    this.porta=porta;
    this.motor=motor;
    this.roda=roda;
}    
    
public String toString(){
    return "\n--- Dados do VEÍCULO ---"+
            "\n Placa: "+getPlaca()+
            "\n Cor: "+getCor()+
            "\n"+getPorta()+
            "\n"+getMotor()+
            "\n"+getRoda();
}    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
