package Exercicio06;
import java.util.Scanner;
public class NovoSalario {

    public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   Soma soma= new Soma();     
   
        System.out.println("Digite seu salário e pressione ENTER: ");
        soma.salario=sc.nextDouble();   
   
        System.out.println("Seu salario teve uma gratificacao de: R$"+soma.SomaGratificacao()); 
        System.out.println("Seu salario com a gratificação ficou: R$"+soma.SomaSalario());
        System.out.println("O valor do juros sobre seu salário foi de: R$"+soma.SomaImposto());
        System.out.println("");
        System.out.println("Seu salario ficou: "+soma.NovoSalario());
      
        
    }
    
}
