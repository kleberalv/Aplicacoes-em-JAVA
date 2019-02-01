
package associacaocachorro;
public class Cachorro {
    private String codigo;
    private String nome;
    private String raca;
    private Proprietario proprietario;
    private Filiacao filiacao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }
    public Cachorro(String codigo, String nome, String raca, Proprietario proprietario, Filiacao filiacao){
        this.codigo=codigo;
        this.filiacao=filiacao;
        this.nome=nome;
        this.proprietario=proprietario;
        this.raca=raca;
    }
    public String toString(){
        return "\n Nome do Cachorro:" +getNome()+
                "\n Código do Cachorro:" +getCodigo()+
                "\n Raça do Cachorro:" +getRaca()+
                "\n Filiação do Cachorro:" +getFiliacao()+
                "\n Dono do Cachorro:" +getProprietario();
    }
    
}
