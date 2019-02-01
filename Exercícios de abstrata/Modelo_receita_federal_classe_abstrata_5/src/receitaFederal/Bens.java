package receitaFederal;
public class Bens {
    
    private int codigo;
    private String descricao;
    private Double valor;

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
    
    public Bens(int codigo, String descricao, Double valor){
        this.codigo=codigo;
        this.descricao=descricao;
        this.valor=valor;
    }
    
    public double calculaTarifa(){
        return valor+=(valor*0.15);
    }
    
    @Override
    public String toString(){
        return  "\n ----Dados de Bens ----"+
                "\n Codigo: "+getCodigo()+
                "\n Descrição: "+getDescricao()+
                "\n Valor: "+getValor();
    }
    
}
