package modeloInterface;
public class TestaCliente {

    public static void main(String[] args) {
        
    Cliente c = new Cliente(48.0, 5, "052.698.753-45", "Kleber Alves", 
                    new Impressao(2.0, "Impressão preta e branco"), 
                        new Internet(2.0, "Acesso"));    
        
    Tecnico t = new Tecnico("147258369", 980.0, "789.654.123-05", "Isadora Rios", 
                    new Equipamento("HP", "Scanner"));
    
    Funcionario f = new Funcionario(321456987, 1000.0, "195.753.641-58", "Carlos Eduardo");

        System.out.println(c);
        System.out.println(t);
        System.out.println(f);
        
    }
    
}
