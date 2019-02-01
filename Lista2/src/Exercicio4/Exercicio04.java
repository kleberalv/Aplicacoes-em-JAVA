package Exercicio4;
import java.util.Scanner;
public class Exercicio04 {

    
    
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
   Soma soma= new Soma();
        System.out.println("Digite a largura e pressione ENTER: ");
        soma.largura=sc.nextFloat();
        System.out.println("Digite o comprimento e pressione ENTER: ");
        soma.comprimento=sc.nextFloat();        
        System.out.println("Digite a altura e pressione ENTER: ");
        soma.altura=sc.nextFloat(); 
        
        
        System.out.println("O volume do objeto é igual a: "+soma.Volume()+" CM³");
    }
    
}
