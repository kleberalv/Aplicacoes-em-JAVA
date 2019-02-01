package herancapessoa;

public class deMoveis extends Vendedor{
    
private String nomeLoja;
private String nomeSetor;
private Double comissao;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

   public deMoveis(String Nome, String Endereco, int matr, Double salario, String nomeLoja, String nomeSetor, Double comissao){
   super(Nome, Endereco, matr, salario);
   this.comissao= comissao;
   this.nomeLoja= nomeLoja;
   this.nomeSetor= nomeSetor;      
   } 
   
   public String toString(){
       
       return "\n--- Dados vendedor de MÓVEIS ---"+
              "\nNome: "+getNome()+
              "\nEndereço: "+getEndereco()+
              "\nMatrícula: "+getMatr()+
              "\nNome da loja: "+getNomeLoja()+
              "\nNome do setor: "+getNomeSetor()+
              "\nValor da comissão: "+getComissao();
              
   }
}
