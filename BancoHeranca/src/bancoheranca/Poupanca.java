package bancoheranca;

public class Poupanca extends Conta{
    
    public Poupanca(int nConta, String nome) {
        super(nConta, nome);
    }
    
    public String toString(){
        return super.toString()+"0";
    }
    
    public void reajustar(double percentual){
        double saldoAtual=this.getSaldo();
        double reajuste=saldoAtual*percentual;
        deposita(reajuste);
    }
}
