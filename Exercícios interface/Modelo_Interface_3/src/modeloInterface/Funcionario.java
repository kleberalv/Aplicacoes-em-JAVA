package modeloInterface;
public class Funcionario extends Pessoa implements Comissao{
    
    private int matr;
    private Double valorComissao;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public Double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(Double valorComissao) {
        this.valorComissao = valorComissao;
    }
    
    public Double calculaSalComissao(){
        return sal+valorComissao;
    }
    
    public Funcionario(int matr, Double valorComissao, String cpf, String nome){
        super(cpf, nome);
        this.matr=matr;
        this.valorComissao=valorComissao;
    }
    
    public String toString(){
        return  "";
    }
    
}
