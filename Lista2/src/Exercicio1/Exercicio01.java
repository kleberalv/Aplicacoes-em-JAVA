package Exercicio1;
import java.util.Scanner;
public class Exercicio01 {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
        
        Soma soma= new Soma ();
        
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n1= sc.nextInt();
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n2= sc.nextInt();
         System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n3= sc.nextInt();
        
        System.out.println("O número: "+soma.n1+ " Convertido para FLOAT é: "+soma.Numero1());
        System.out.println("O número: "+soma.n2+ " Convertido para FLOAT é: "+soma.Numero2());
        System.out.println("O número: "+soma.n3+ " Convertido para FLOAT é: "+soma.Numero3());
    }
    //O número inteiro digitado foi convertido para Float.
}
