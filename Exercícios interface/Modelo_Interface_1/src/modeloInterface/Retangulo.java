package modeloInterface;
public class Retangulo extends FiguraGeometrica implements ObjetoGeometrico {
    
    private Double ladoMenor;
    private Double ladoMaior;
    
    public Double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(Double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public Double getLadoMaior() {
        return ladoMaior;
    }

    public void setLadoMaior(Double ladoMaior) {
        this.ladoMaior = ladoMaior;
    }    

    public Retangulo(Double ladoMenor, Double ladoMaior, String nome){
        super(nome);
        this.ladoMenor=ladoMenor;
        this.ladoMaior=ladoMaior;
    }
    
    @Override
    public Double calculaArea(){
        return ladoMenor*ladoMaior;
    }
    
    @Override
    public Double calculaPerimetro(){
        return (2*ladoMenor)+(2*ladoMaior);
    }
    
    @Override
    public String toString(){
        return  "\n  ---- Dados do Retângulo ---- "+
                "\n Lado menor: "+getLadoMenor()+
                "\n Lado maior: "+getLadoMaior()+
                "\n Nome: "+getNome()+
                "\n Área do quadrado: "+df.format(calculaArea())+
                "\n Perímetro do quadrado: "+df.format(calculaPerimetro());
    }
    
}
