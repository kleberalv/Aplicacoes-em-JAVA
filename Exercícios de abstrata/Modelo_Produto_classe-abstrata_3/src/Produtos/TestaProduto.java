package Produtos;
public class TestaProduto {

    public static void main(String[] args) {
            
        Loja l = new Loja("147258369", "Star Moveis", 
                    new Fogao(4,"147852369", "Fogão Phillips", 2200.0, 
                        new Fornecedor("369852147", "Fornece RAPIDOLA", 
                            new DoFornecedor("25/05/2035",15, "19/09/2018", 1500.0), 
                                new Endereco("Taguacenter", 26)), 
                                    new Fisica("072.369.451-74","Kleber Alves", 1.80, 73.5, 1999, 2018, 
                                    new Endereco("Areal", 13))), 
                new MaquinaLavar(100, "1598746320", "Lavadora Phillips", 1900.0, 
                    new Fornecedor("369258147", "Fornece RAPIDOLA", 
                        new DoFornecedor("25/05/2035",16, "19/09/2018",1300.0), 
                            new Endereco("Taguacenter", 26)), 
                                new Fisica("255.698.956-56","Isadora Rios", 1.66, 45.5, 1996, 2018, 
                                    new Endereco("QNL", 26))), 
                new Geladeira("Phillips", 2, "014596872", "Geladeira Phillips", 4000.0, 
                    new Fornecedor("369258147", "Fornece RAPIDOLA", 
                        new DoFornecedor("25/05/2035", 17, "19/09/2018", 1.999), 
                            new Endereco("Taguacenter", 26)), 
                                new Fisica("145.986.369-89","Marcos Vinicius", 1.78, 56.5, 1999, 2018, 
                                    new Endereco("Santa Maria",45))));
        
        System.out.println(l);
        
        
    }
    
}
