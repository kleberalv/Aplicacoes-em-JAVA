package bancoheranca;
import java.util.Scanner;
public class BancoHeranca {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        Especial esp= new Especial(0," ",0.0);
        Poupanca poup= new Poupanca(0,"");
        
        System.out.println("Entre com o número da conta: ");
        esp.setnConta(1);
        
        System.out.println("Entre com o nome do cliente especial: ");   
        esp.setNome("Kleber");
        
        System.out.println("Entre com o número da conta poupança: ");
        poup.setnConta(2);
        
        System.out.println("Entre com o nome do cliente da poupança: ");
        poup.setNome("Marcos");
        
        System.out.println("Entre com o valor de saque: ");   
        esp.Saca(100);
        
        System.out.println("Entre com a taxa de reajuste: ");
        poup.reajustar(0.5);
        
        System.out.println(esp.toString()); 
        System.out.println(poup.toString());
    }
    
}
