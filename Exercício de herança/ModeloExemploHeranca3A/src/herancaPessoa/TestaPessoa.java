package herancaPessoa;

public class TestaPessoa {

    public static void main(String[] args) {
        Empregado emp = new Empregado("147","José",30, 1000.00);
        Aluno a = new Aluno("123", "João", 20, "Informática");
        
        System.out.println(emp); 
        System.out.println(a);
        
    }
    
}