package Exercicios;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
    int n1,n2,n3,media;
    Scanner entrada= new Scanner(System.in);
        System.out.println("Digite suas notas para fazer a média: ");
      n1= entrada.nextInt();
      n2= entrada.nextInt();
      n3= entrada.nextInt();
      
      n1= n1*1;
      n2= n2*2;
      n3= n3*2;
      
      media= (n1+n2+n3)/5;
      
        System.out.println("Sua média é: " +media);
    
    } 

}