package Exercicio05;
import java.util.Scanner;
public class NovoSalario {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        Soma soma= new Soma();
        
        
        System.out.println("Digite seu salário e pressione ENTER: ");
        soma.salario=sc.nextFloat();
        
        
        System.out.println("Digite o percentual de aumento e pressione ENTER: ");
        soma.reajuste=sc.nextFloat();
        
        
        System.out.println("Seu salário com o percentual de aumento de: "+soma.reajuste+ " é de: "+soma.CalculoSalario());
        
    
    }
    
}
