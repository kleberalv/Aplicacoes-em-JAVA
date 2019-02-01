package Produtos;

public class Loja {
    
    private String cnpj;
    private String nome;
    private MaquinaLavar maquinaLavar;
    private Fogao fogao;
    private Geladeira geladeira;
    private Fisica fisica;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MaquinaLavar getMaquinaLavar() {
        return maquinaLavar;
    }

    public void setMaquinaLavar(MaquinaLavar maquinaLavar) {
        this.maquinaLavar = maquinaLavar;
    }

    public Fogao getFogao() {
        return fogao;
    }

    public void setFogao(Fogao fogao) {
        this.fogao = fogao;
    }

    public Geladeira getGeladeira() {
        return geladeira;
    }

    public void setGeladeira(Geladeira geladeira) {
        this.geladeira = geladeira;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }
    
    public Loja(String cnpj, String nome, Fogao fogao, MaquinaLavar maquinaLavar, Geladeira geladeira){
    this.cnpj=cnpj;
    this.nome=nome;
    this.maquinaLavar=maquinaLavar;
    this.geladeira=geladeira;
    this.fogao=fogao;
    }
    
    public String toString(){
        return  "\n ---- Dados da LOJA ----"+
                "\n CNPJ: "+getCnpj()+
                "\n Nome da loja: "+getNome()+
                "\n "+getMaquinaLavar()+
                "\n "+getGeladeira()+
                "\n "+getFogao();
    }
    
}
