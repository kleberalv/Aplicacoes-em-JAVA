
package ModificadorEstatico;
public class Pagamento {
    private int codigo;
    private String descricao;
    private static Double valor;

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
    public Pagamento(int codigo, String descricao, Double valor){
        this.codigo=codigo;
        this.descricao=descricao;
        this.valor=valor;
    }
    public static Double calculaTaxa(){
      return valor*0.03;  
    }
    public String toString(){
        return "\n Descrição:" +getDescricao()+
                "\n Valor:" +getValor()+
                "\n Taxa:" +calculaTaxa()+
                "\n Código:"+getCodigo();
    }
    
    
}
