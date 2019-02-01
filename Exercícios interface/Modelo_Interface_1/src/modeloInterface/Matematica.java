package modeloInterface;
public class Matematica extends Disciplina{
    
    private Double cargaHoraria;
    private AplicacaoPratica aplicacaoPratica;
    

    public AplicacaoPratica getAplicacaoPratica() {
        return aplicacaoPratica;
    }

    public void setAplicacaoPratica(AplicacaoPratica aplicacaoPratica) {
        this.aplicacaoPratica = aplicacaoPratica;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public Matematica(Double cargaHoraria, String nome, AplicacaoPratica aplicacaoPratica){
        super(nome);
        this.cargaHoraria=cargaHoraria;
        this.aplicacaoPratica=aplicacaoPratica;
    }
    
    public String toString(){
        return  "\n  ---- Dados Matemática ---- "+
                "\n Carga horária: "+getCargaHoraria()+
                "\n Nome: "+getNome()+
                "\n "+getAplicacaoPratica();
    }

    
}
