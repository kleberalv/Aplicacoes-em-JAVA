package Exercicio04;
import java.util.Scanner;
public class ReajusteSalario {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    
      Soma soma= new Soma();
      
        System.out.println("Digite o seu salário e pressione ENTER: ");
        soma.salario=sc.nextFloat();
        
        System.out.println("Seu salário com o percentual de 25% de aumento ficou: " +soma.CalcularSalario());
        
    }
    
}
