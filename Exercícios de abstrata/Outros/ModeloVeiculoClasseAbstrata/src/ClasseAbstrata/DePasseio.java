
package ClasseAbstrata;
public class DePasseio extends Veiculo {
    private String marca;
    private String descricao;
    private Montadora montadora;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
    public DePasseio(String marca, String descricao, Montadora montadora,String placa, int ano, String cor, Double preco, Proprietario proprietario){
        super (placa, ano, cor, preco,proprietario);
        this.marca=marca;
        this.descricao=descricao;
        this.preco=preco;
        this.montadora=montadora;
    }
    public Double ipva(){
        return preco*0.03;
    }
    public Double seguro(){
        return (preco*1.05)/100;
    }
    public String toString(){
        return "\n Dados do Veiculo de Passeio "+
                "\n Placa:" +getPlaca()+
                "\n Ano:" +getAno()+
                "\n Cor:" +getCor()+
                "\n Preço:" +df.format(getPreco())+
                "\n Marca:" +getMarca()+
                "\n Descrição:" +getDescricao()+
                "\n Valor do IPVA:" +df.format(ipva())+
                "\n Valor do Seguro:" +df.format(seguro())+
                "\n Dados do Proprietario do veículo de Passeio" +getProprietario()+
                "\n Dados da Montadora do veículo de Passeio" +getMontadora();
    }
    
    
    
    
    
}
