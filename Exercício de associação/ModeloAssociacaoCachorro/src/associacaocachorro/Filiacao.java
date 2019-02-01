
package associacaocachorro;
public class Filiacao {
    private String nomeDoPai;
    private String nomeDaMae;

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }
    public Filiacao (String nomeDoPai, String nomeDaMae){
        this.nomeDaMae=nomeDaMae;
        this.nomeDoPai=nomeDoPai;
    }
    public String toString(){
        return " \n Nome do Pai:"+getNomeDoPai() +
                "\n Nome da Mãe:" +getNomeDaMae();
    }
    
    
}
