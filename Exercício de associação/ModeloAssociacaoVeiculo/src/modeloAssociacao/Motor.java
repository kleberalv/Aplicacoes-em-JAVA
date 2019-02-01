
package modeloAssociacao;
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
    
    public Motor(Double potencia, String tipoCombustive){
        this.potencia=potencia;
        this.tipoCombustivel=tipoCombustivel;
    }
    public String toString(){
        return "\n Potencia:" +getPotencia() +
                "\n Tipo de Combustível:" +getTipoCombustivel();
    }
    
}
