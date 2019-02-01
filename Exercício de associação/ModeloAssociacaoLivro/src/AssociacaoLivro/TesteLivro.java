
package AssociacaoLivro;
public class TesteLivro {
    public static void main(String[] args) {
       Livro l = new Livro("ETB", 200, 
               new Edicao(111, 2018, 
               new Patrocinador("Isadora", 
               new Endereco("São José", 5), 
               new Editora("1a2b", "Saraiva", 
               new Endereco("Vila Lobos", 9)))));
       
       System.out.println(l);
        
       
    }
    
}
