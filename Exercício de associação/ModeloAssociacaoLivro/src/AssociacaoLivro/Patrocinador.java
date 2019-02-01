
package AssociacaoLivro;
public class Patrocinador {
    private String nome;
    private Endereco endereco;
    private Editora editora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    public Patrocinador(String nome, Endereco endereco, Editora editora){
        this.nome=nome;
        this.editora=editora;
        this.endereco=endereco;
    }
    public String toString(){
        return "\n Nome do Patrocinador:" +getNome()+
                 "\n Endereço" +getEndereco()+
                "\n" +
                "\n DADOS DA EDITORA" +getEditora();
                
    }
    
}
