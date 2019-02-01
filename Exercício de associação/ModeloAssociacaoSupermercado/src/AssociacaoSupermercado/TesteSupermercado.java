
package AssociacaoSupermercado;
public class TesteSupermercado {
    public static void main(String[] args) {
        Supermercado S = new Supermercado("12345", "Extra", "33552266",
                new Endereco("Palmeiras", "12", 
                new Cep ("72180050")), 
                new Cliente("8569487595", "Paula", 27,
                new Endereco("Samdu", "85",
                new Cep ("729658745")),
                new Produto ("52525252", "Porta", 100.00, 
                new Fornecedor("869745213", "Fornecedor1", "33569875",
                new Endereco("Comercial", "69",
                new Cep ("7289653289"))))), 
                new Produto("9636963696", "Janela", 70.0,
                new Fornecedor("2536253425", "Fornecedor2", "33587421", 
                new Endereco("São Sebastião", "64",
                new Cep("7253468425")))));
        
        System.out.println(S);
    }
    
    
}
