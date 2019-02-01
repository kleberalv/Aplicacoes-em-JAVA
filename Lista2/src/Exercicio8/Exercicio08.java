package Exercicio8;
import java.util.Scanner;
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Soma soma= new Soma();
        
        System.out.println("Programa para calcular a formula: ax²+ bx + c");
        System.out.println("Entre com os valores: ");
        System.out.print("A= ");
        soma.a= sc.nextInt();
        System.out.print("B= ");
        soma.b= sc.nextInt();
        System.out.print("C= ");
        soma.c= sc.nextInt();
        
        System.out.println(""+soma.a+"x²+"+soma.b+"x+"+soma.c);
        System.out.println("");
        System.out.println("Raiz de: "+soma.Resultado()+" é igual a: "+soma.Raiz());
        
        System.out.println("X'= "+soma.x1());
        System.out.println("X''= "+soma.x2());
    }
    
}
