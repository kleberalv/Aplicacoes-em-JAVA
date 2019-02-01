
package ClasseAbstrata;
public class Moto extends Veiculo {
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public Moto(int cilindrada, String placa, int ano, String cor, Double preco, Proprietario proprietario){
     super(placa, ano, cor, preco, proprietario);
     this.cilindrada=cilindrada;
    
}
    public Double ipva(){
        return preco*0.08;
        
    }
    public Double seguro(){
        return (preco*2.5)/100;
    }
    public String toString(){
        return "\n Dados da Moto"+
                "\n Placa:" +getPlaca()+
                "\n Ano:" +getAno()+
                "\n Cor:" +getCor()+
                "\n Preço:" +df.format(getPreco())+
                "\n Cilindrada:" +getCilindrada()+
                "\n Valor do IPVA:" +df.format(ipva())+
                "\n Valor do Seguro:" +df.format(seguro())+
                "\n Dados do Proprietario da Moto" +getProprietario();
                
    }
    
}
