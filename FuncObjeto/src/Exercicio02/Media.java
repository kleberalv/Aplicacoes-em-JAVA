package Exercicio02;
import java.util.Scanner;
public class Media {

    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
       Soma soma= new Soma();
      
        System.out.println("Digite sua primeira nota e pressione ENTER: ");
        soma.n1=sc.nextFloat();
        System.out.println("Digite sua segunda nota e pressione ENTER :");
        soma.n2=sc.nextFloat();
        System.out.println("Digite sua terceira nota e pressine ENTER; ");
        soma.n3=sc.nextFloat(); 
        
        System.out.println("A soma das notas: " +soma.n1+" + "+soma.n2+" + "+soma.n3+ " Gerou a média: " +soma.Resultado());
    }
    
}
