package herancapessoa;

public class deVeiculos extends Vendedor{
    
    private int qtdVendida;

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }
    
    public deVeiculos(String Nome, String Endereco, int matr, Double salario, int qtdVendida){
       super(Nome, Endereco, matr, salario); 
       this.qtdVendida= qtdVendida;
    }
    
    public String toString(){
           return "\n--- Dados vendedor de VEÍCULOS ---"+
              "\nNome: "+getNome()+
              "\nEndereço: "+getEndereco()+
              "\nMatrícula: "+getMatr()+
              "\nSalário: "+getSalario()+
              "\nQuantidade vendida: "+getQtdVendida();
    }
}
