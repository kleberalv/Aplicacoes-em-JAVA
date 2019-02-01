package AssociacaoVeiculo;

public class Motor {
    
private Double potencia;
private String tipoCombustivel;

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
public Motor(Double potencia, String tipoCombustivel){
 this.potencia= potencia;
 this.tipoCombustivel= tipoCombustivel;
       
} 

public String toString(){
    return "\n---Dados do motor ---"+
            "\nPotência: "+getPotencia()+
            "\nTipo de combustivel: "+getTipoCombustivel();
}
}
