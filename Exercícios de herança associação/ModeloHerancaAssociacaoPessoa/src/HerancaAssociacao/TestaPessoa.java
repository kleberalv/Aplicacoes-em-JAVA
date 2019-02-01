package HerancaAssociacao;

public class TestaPessoa {

    public static void main(String[] args) {
     Fisica f = new Fisica("Isadora", 
                            new Endereco("Avenida QNJ", 20), "05698541320");
     
     Juridica j = new Juridica("GDF", 
                                new Endereco("Asa norte", 01), "1010");
        
        
        System.out.println(f);
        System.out.println(j);
        
        
    }
    
}
