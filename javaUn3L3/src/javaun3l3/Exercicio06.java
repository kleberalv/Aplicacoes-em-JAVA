package javaun3l3;
import java.util.Scanner;
public class Exercicio06 {
    
 Scanner sc= new Scanner(System.in);
 
int i,num,contador;    
   
void resultado(){
 
    
for (i=1; i<=12 ; i++){
    
    System.out.println("Digite o "+i+"º número e pressione ENTER: ");
    num= sc.nextInt();

    contador= num+contador;   
}

System.out.println("O resultado é: "+contador);
    }
}