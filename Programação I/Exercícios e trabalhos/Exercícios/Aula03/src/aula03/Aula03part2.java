package aula03;
import java.util.Scanner;
public class Aula03part2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double n1,n2,n3 = 0;

        System.out.println("Digite o primeiro número: ");
        n1=sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2=sc.nextDouble();
        System.out.println("Digite o terceiro número: ");
        n3=sc.nextDouble();
        
           //Qual número é maior número?
       if(n1>n2 && n1>n3){
           System.out.println(n1+" é maior que "+n2+" e "+n3);
       }else
         if(n2>n1 && n2>n3){
           System.out.println(n2+" é maior que "+n1+" e "+n3);
        }else
         if(n3>n1 && n3>n2){
           System.out.println(n3+" é maior que "+n1+" e "+n2);
        }else
           System.out.println("\nNúmeros iguais!");
        
    }

}
