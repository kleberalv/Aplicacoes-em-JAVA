
package ModificadorEstatico;
public class Deducao {
    private int codigo;
    private String descricao;
    protected static Double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Deducao(int codigo, String descricao, Double valor){
        this.codigo=codigo;
        this.descricao=descricao;
        this.valor=valor;
    }
    public static Double calculaDeducao(){
        return valor*0.012; 
    }
    public String toString(){
        return "\n Código:" +getCodigo()+
                "\n Descrição:" +getDescricao()+
                "\n Valor:" +getValor();
    }
}
