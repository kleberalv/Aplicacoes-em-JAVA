package Exercicios;
import java.util.Scanner;
public class Exercicio06 {
    
    
    public static void main(String[] args) {
        double salario,novosalario,gratificacao,imposto;
            Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite seu salário e pressione ENTER: ");
       salario= entrada.nextInt();
       
       gratificacao= salario*0.05;
       salario= salario+gratificacao;
       imposto=(salario*0.07);
       novosalario= (salario-imposto);
       
       

        System.out.println("Seu salario teve uma gratificacao de: R$"+gratificacao); 
        System.out.println("Seu salario com a gratificação ficou: R$"+salario);
        System.out.println("O valor do juros sobre seu salário foi de: R$"+imposto);
        System.out.println("");
        System.out.println("Seu salario ficou: "+novosalario);
    }
    
}