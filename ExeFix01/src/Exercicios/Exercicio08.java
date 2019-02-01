package Exercicios;
import java.util.Scanner;
public class Exercicio08 {
    
    
    public static void main(String[] args) {
        int deposito,juros,soma;
            Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite o valor do deposito e pressione ENTER: ");
      deposito = entrada.nextInt();
      
        System.out.println("Digite qual o percentual de juros e pressione ENTER: ");
       juros = entrada.nextInt();
       
       
       soma= deposito+(deposito*juros)/100 ;
       

        System.out.println("Valor do deposito R$: "+deposito); 
        System.out.println("O percentual de juros é de: "+juros);
        System.out.println("O rendimento foi de: R$ "+soma);
    }
    
}