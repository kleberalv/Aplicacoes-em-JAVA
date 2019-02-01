package Exercicio3;
import java.util.Scanner;
public class Exercicio03 {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
      Soma soma= new Soma();
      
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n1= sc.nextInt();
    
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n2= sc.nextFloat();
        
        System.out.println("A soma dos número é igual a: "+soma.Resultado());
        // A soma dos números em inteiro foi convertida a Float.
    }   
}
