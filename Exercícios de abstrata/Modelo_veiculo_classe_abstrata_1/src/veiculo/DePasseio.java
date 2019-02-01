package veiculo;

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
    
    public Double ipva(){
        return preco*0.03;
    }
   public Double seguro(){
       return (preco*1.5)/100;
   }
    
    public DePasseio(String marca, String descricao, Montadora montadora, String placa, int ano, String cor, Double preco, Proprietario proprietario){
        super(placa, ano, cor, preco, proprietario);
        this.marca=marca;
        this.descricao=descricao;
        this.montadora=montadora; 
    }
    public String toString(){
        return  "\n--- Dados do veículo ---"+
                "\n Marca: "+getMarca()+
                "\n Descrição: "+getDescricao()+
                "\n Placa: "+getPlaca()+
                "\n Ano: "+getAno()+
                "\n Cor: "+getCor()+
                "\n Preço: "+df.format(getPreco())+
                "\n Valor do IPVA: "+df.format(ipva())+
                "\n Valor do seguro: "+df.format(seguro())+
                getProprietario()+
                getMontadora();
    }
    
}
