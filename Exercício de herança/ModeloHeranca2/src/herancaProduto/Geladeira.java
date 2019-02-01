package herancaProduto;

public class Geladeira extends Produto{
    
private String marca;
private int CapacideLitros;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacideLitros() {
        return CapacideLitros;
    }

    public void setCapacideLitros(int CapacideLitros) {
        this.CapacideLitros = CapacideLitros;
    }
    public Geladeira(String codBarra, String nome, Double Preco, String Marca, int CapacidadeLitros){
    super(codBarra, nome, Preco);
    this.marca= Marca;
    this.CapacideLitros= CapacidadeLitros;    
    }
    
   public String toString(){
        return "-- DADOS GELADEIRAS --"+
                "\nCodigo de barras: "+getCodBarra()+
                "\nNome: "+getNome()+
                "\nPreço: "+getPreco()+
                "\nMarca: "+getMarca()+
                "\nCapacidade em litros: "+getCapacideLitros()+
                "\n";
   } 
    
}
