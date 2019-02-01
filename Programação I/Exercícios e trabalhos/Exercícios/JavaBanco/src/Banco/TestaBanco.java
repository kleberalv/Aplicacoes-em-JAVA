package Banco;
import java.util.Scanner;

public class TestaBanco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Conta c3 = new Conta();
        
        c1.setNumeroConta(76521);
        c2.setNumeroConta(99213);
        c3.setNumeroConta(32466);
        
        c1.setNomeDonaConta("João");
        c2.setNomeDonaConta("José");
        c3.setNomeDonaConta("Maria");
        
        c1.setSaldo(500.0);
        c2.setSaldo(600.0);
        c3.setSaldo(700.0);
        
        c1.setLimite(1000.0);
        c2.setLimite(1000.0);
        c3.setLimite(1000.0);
        
      
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        
    }
    
}
