
package ClasseAbstrata;
public class Onibus extends Veiculo {
    private int qtdPassageiros;
    private Montadora montadora;

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
    public Onibus(int qtdPassageiros, Montadora montadora,String placa, int ano, String cor, Double preco, Proprietario proprietario){
        super(placa, ano, cor, preco, proprietario);
        this.qtdPassageiros=qtdPassageiros;
        this.montadora=montadora;
        
    }
    public Double ipva(){
        return preco*0.05;
        
    }
    public Double seguro(){
        return (preco*2.5)/100;
    }
    public String toString(){
        return  "\n Dados do Onibus "+
                "\n Placa:" +getPlaca()+
                "\n Ano:" +getAno()+
                "\n Cor:" +getCor()+
                "\n Preço:" +df.format(getPreco())+
                "\n Valor do IPVA:" +df.format(ipva())+
                "\n Valor do Seguro:" +df.format(seguro())+
                "\n Quantidade de Passageiros:" +getQtdPassageiros()+
                "\n Dados do Proprietario do Onibus" +getProprietario()+
                "\n Dados da Montadora de Onibus" +getMontadora();
    }
    
}
