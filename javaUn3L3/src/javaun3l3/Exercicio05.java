package javaun3l3;
import java.util.Scanner;
public class Exercicio05 {
Scanner sc=new Scanner(System.in);
    int i,num,mult,contador;
        
        void calculoTriplo(){
           while (i<=9){
            System.out.println("Digite um número e pressione ENTER: ");
            System.out.println("");
            num=sc.nextInt();
            mult=(num*3);
            contador= contador+1;
            System.out.println("O tríplo do número: "+num+ " é: "+mult); 
            System.out.println("");
            System.out.println("Repetição de numero: "+contador+" de 10");
            System.out.println("");
i++;            
        }
            System.out.println("Fim do programa...");            
        }
}