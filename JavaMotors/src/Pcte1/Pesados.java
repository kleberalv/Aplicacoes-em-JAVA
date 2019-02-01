package Pcte1;
public class Pesados extends Veiculo {

private int nchass;

    public Pesados(String marca, int ano, int nchass) {
        super(marca);
        this.nchass=nchass;
    }

    public int getNchass() {
        return nchass;
    }

    public void setNchass(int nchass) {
        this.nchass = nchass;
    }

    @Override
    public String toString() {
        return    "Número de chassi: "+this.nchass
                + "\nAno de fabricação do motor: "+this.moto.getFab()
                + "\nPreço do motor: "+this.moto.getPreco();
    }    
    
}
