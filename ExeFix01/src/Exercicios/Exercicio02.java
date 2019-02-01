package Exercicios;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
    int n1,n2,n3,media;
    Scanner entrada= new Scanner(System.in);
        System.out.println("Digite suas notas abaixo para fazer a média: ");
        n1= entrada.nextInt();
        n2= entrada.nextInt();
        n3= entrada.nextInt();
        
    media= (n1+n2+n3)/3;
        System.out.println("Sua média é de: " +media);
    }
    
}
