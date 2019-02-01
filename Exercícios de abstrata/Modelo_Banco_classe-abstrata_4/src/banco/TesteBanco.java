package banco;
public class TesteBanco {

    public static void main(String[] args) {

    Fisica f =  new Fisica("076.654.698-84", 500.0, "Kleber Alves", "(61) 98454-7809", 1000.0, 350.0, 
                    new Conta(147258369, 460.60, 
                        new Transacao("Transferência", 100.0), 
                            new Agencia(12, "Banco do Brasil")), 
                new Endereco("Areal", 13, 
                    new CEP("71980.540")), 
                    new CartaoCredito(369852741, "24/09/2018", 300.0, 
                        new TransacaoCartao(25, 400.0)));
        
        
        
        
        System.out.println(f);        
        
        
        
        
        
        
        
    }
    
}
