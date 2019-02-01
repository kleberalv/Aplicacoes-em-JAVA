package modeloInterface;
public class Circulo extends FiguraGeometrica implements ObjetoGeometrico{
    
    private Double raio;
    
    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
    public Circulo(Double Raio, String nome){
        super(nome);
        this.raio=Raio;
    }
    
    @Override
    public Double calculaArea(){
        return Math.PI*(raio*raio);
    }
    
    @Override
    public Double calculaPerimetro(){
        return (2*Math.PI)*raio;
    }
    
    @Override
    public String toString(){
        return  "\n  ---- Dados do Circulo ---- "+
                "\n Raio: "+getRaio()+
                "\n Nome: "+getNome()+
                "\n Área do quadrado: "+df.format(calculaArea())+
                "\n Perímetro do quadrado: "+df.format(calculaPerimetro());
    }
     
}
