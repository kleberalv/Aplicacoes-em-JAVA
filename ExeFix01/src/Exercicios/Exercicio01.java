package Exercicios;
import java.util.Scanner;
public class Exercicio01 {

    public static void main(String[] args) {
        int n1,n2,n3,n4,soma;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite quatro números para efetuar a soma entre eles e pressione ENTER: ");
        n1=entrada.nextInt();
        n2=entrada.nextInt();
        n3=entrada.nextInt();
        n4=entrada.nextInt();
        
        
        soma= n1+n2+n3+n4;
        System.out.println("A soma dos números é: "+soma);
                
    }
    
}
