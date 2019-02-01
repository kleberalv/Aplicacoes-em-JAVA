
package AssociacaoLivro;
public class Livro {
    private String titulo;
    private int numeroPaginas;
    private Edicao edicao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Edicao getEdicao() {
        return edicao;
    }

    public void setEdicao(Edicao edicao) {
        this.edicao = edicao;
    }
    public Livro(String titulo, int numeroPaginas, Edicao edicao){
        this.titulo=titulo;
        this.numeroPaginas=numeroPaginas;
        this.edicao=edicao;
    }
    public String toString(){
        return " \n DADOS DO LIVRO" +
                "\n Título do livro:" +getTitulo()+
                "\n Número de Páginas:" +getNumeroPaginas()+
                "\n"+
                "\n DADOS DA EDIÇÃO " +getEdicao();
    }
}
