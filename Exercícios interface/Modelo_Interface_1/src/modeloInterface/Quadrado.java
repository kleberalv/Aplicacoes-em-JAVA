package modeloInterface;
public class Quadrado extends FiguraGeometrica implements ObjetoGeometrico{
    
    private Double lado;


    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    
    public Quadrado(Double lado, String nome){
        super(nome);
        this.lado=lado;
    }
    
    @Override
    public Double calculaArea(){
        return lado*lado;
    }
    
    @Override
    public Double calculaPerimetro(){
        return lado+(4*lado);
    }
    
    @Override
    public String toString(){
        return  "\n  ---- Dados do Quadrado ---- "+
                "\n Lados: "+getLado()+
                "\n Nome: "+getNome()+
                "\n Área do quadrado: "+df.format(calculaArea())+
                "\n Perímetro do quadrado: "+df.format(calculaPerimetro());
    }
    
}
