package Exercicio02;
import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Soma soma= new Soma();
        
        System.out.println("Digite sua primeira nota e pressione ENTER: ");
        soma.nota1=sc.nextFloat();
        
        System.out.println("Digite o peso da primeira nota e pressione ENTER: ");
//        soma.peso1=sc.nextInt();
        
        System.out.println("Digite sua segunda nota e pressione ENTER: ");
//        soma.nota2=sc.nextFloat();
        
        System.out.println("Digite o peso da segunda nota e pressione ENTER: ");
//        soma.peso2=sc.nextInt();
        
        System.out.println("Digite sua terceira nota e pressione ENTER: ");
//        soma.nota3=sc.nextFloat();
        
        System.out.println("Digite o peso da terceira nota e pressione ENTER: ");
//        soma.peso3=sc.nextInt();
        
//        System.out.println("As soma das notas: " +soma.nota1+" + "+soma.nota2+" + "+soma.nota3+" Gerou sua média: " +soma.CalculaMedia());
    }
    
}
