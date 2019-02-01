
package associacaocachorro;
public class Proprietario {
    String nome;
    String endereco;
    Filiacao filiacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }
    
    public Proprietario (String nome, String endereco, Filiacao filiacao ){
        this.nome=nome;
        this.endereco=endereco;
        this.filiacao=filiacao;
    }
    public String toString(){
        return "\n Nome do Proprietário:" +getNome() +
                "\n Endereço do Proprietário:" +getEndereco()+
                "\n Filiação do Proprietário:" +getFiliacao();
                
    }
    
}
