package modeloAssociacao;

public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa P = new Pessoa("123", "Wildisom", 30, 
                new Endereco("Avenida Ecológica",13));
        
        System.out.println(P);
        
        
    }
    
}
