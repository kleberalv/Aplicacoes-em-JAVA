
package modeloAssociacao;
public class Veiculo {
    private String placa;
    private String cor;
    private Motor motor;
    private Roda roda;
    private Porta porta;

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

    public Porta getPorta() {
        return porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }
    
    public Veiculo(String placa, String cor, Motor motor, Roda roda, Porta porta){
      this.placa=placa;
      this.cor=cor;
      this.motor=motor;
      this.porta=porta;
      this.roda=roda;
    }
    public String toString(){
        return "Placa:" +getPlaca() +
                "\n Cor:" +getCor() +
                "\n Motor:" + getMotor() +
                "\n Roda:" +getRoda()+
                "\n Porta:" +getPorta();
    }
    
}
