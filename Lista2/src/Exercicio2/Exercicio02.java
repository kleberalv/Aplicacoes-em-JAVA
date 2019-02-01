package Exercicio2;
import java.util.Scanner;
public class Exercicio02 {

    
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    Soma soma= new Soma();
    
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n1= sc.nextFloat();
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n2= sc.nextFloat();
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n3= sc.nextFloat();
        
        System.out.println("O número: "+soma.n1+ " Convertido para INT é: "+soma.Numero1());
        System.out.println("O número: "+soma.n2+ " Convertido para INT é: "+soma.Numero2());
        System.out.println("O número: "+soma.n3+ " Convertido para INT é: "+soma.Numero3());
    }
   // O número em Float digitado foi convertido para inteiro. 
}
