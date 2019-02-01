package Pcte1;
public class Leves extends Veiculo {
    
private int nPass;

    public Leves(String marca, int npass, int ano) {
        super(marca);
        this.nPass= npass;
    }

    public int getnPass() {
        return nPass;
    }

    public void setnPass(int nPass) {
        this.nPass = nPass;
    }

    @Override
    public String toString() {
        return   "Número de passageiros: "+this.nPass
                + "\nAno de fabricação do motor: "+this.moto.getFab()
                +"\nPreço do motor: "+this.moto.getPreco();
    }

    
   
}
