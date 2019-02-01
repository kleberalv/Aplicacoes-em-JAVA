package herancaassociacao;

public class Galpao {
    
   private int numero;
   private Double largura;
   private Double comprimento;
   private Expositor expositor;
   private Visitante visitante;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Expositor getExpositor() {
        return expositor;
    }

    public void setExpositor(Expositor expositor) {
        this.expositor = expositor;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }
   
   public Galpao(int numero, Double largura, Double comprimento, Expositor expositor, Visitante visitante){
       this.numero=numero;
       this.largura=largura;
       this.comprimento=comprimento;
       this.expositor=expositor;
       this.visitante=visitante;
       
   }
   
    
}
