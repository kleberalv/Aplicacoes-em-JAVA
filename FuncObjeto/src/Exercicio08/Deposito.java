package Exercicio08;
import java.util.Scanner;
public class Deposito {
    
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);   
       Soma soma= new Soma();
       
        System.out.println("Digite o valor do deposito e pressione ENTER: ");
        soma.deposito=sc.nextFloat();
        
        System.out.println("Digite o percentual de juros e pressione ENTER: ");
        soma.juros=sc.nextFloat();
        
        
        System.out.println("Valor do deposito R$: "+soma.deposito); 
        System.out.println("O percentual de juros é de: "+soma.juros);
        System.out.println("O rendimento foi de: R$ "+soma.SomaDeposito());

    }
    
}
