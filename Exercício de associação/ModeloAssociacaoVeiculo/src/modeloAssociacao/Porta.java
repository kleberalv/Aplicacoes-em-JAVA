
package modeloAssociacao;
public class Porta {
    private String lado;

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }
    public Porta(String lado){
        this.lado=lado;
    }
    public String toString(){
        return "Lado:" +getLado();
    }
}
