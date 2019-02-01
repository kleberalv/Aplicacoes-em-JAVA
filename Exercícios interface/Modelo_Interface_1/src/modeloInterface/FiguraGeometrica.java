package modeloInterface;

import java.text.DecimalFormat;

public abstract class FiguraGeometrica {
    
    DecimalFormat df = new DecimalFormat("#0,00");
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public FiguraGeometrica(String nome){
        this.nome=nome;   
    }
    
    public abstract String toString();
    
}
