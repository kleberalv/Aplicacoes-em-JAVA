package Exercicios;
import java.util.Scanner;
public class Exercicio07 {
    
    
    public static void main(String[] args) {
        double salario,novosalario,gratificacao,imposto;
            Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite seu salário e pressione ENTER: ");
       salario= entrada.nextInt();
       
       gratificacao= salario+50;
       imposto=(salario*0.10);
       novosalario= (salario-imposto);
       
       

        System.out.println("Seu salario teve uma gratificacao de R$ 50 e ficou: R$"+gratificacao); 
        System.out.println("O valor do juros sobre seu salário foi de: R$"+imposto);
        System.out.println("");
        System.out.println("Seu salario ficou: "+novosalario);
    }
    
}