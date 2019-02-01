
package AssociacaoLivro;
public class Edicao {
    private int numero;
    private int ano;
    private Patrocinador patrocinador;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }
    public Edicao(int numero, int ano, Patrocinador patrocinador){
        this.ano=ano;
        this.numero=numero;
        this.patrocinador=patrocinador;
    }
    public String toString(){
        return "\n Ano da edição:" +getAno()+
                "\n Número da Edição:" +getNumero()+
                "\n "+
                "\n DADOS DO PATROCINADOR "+getPatrocinador();
    }
    
}
