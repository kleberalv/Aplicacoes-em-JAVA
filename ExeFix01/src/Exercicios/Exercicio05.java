package Exercicios;
import java.util.Scanner;
public class Exercicio05 {
    
    
    public static void main(String[] args) {
        double salario,novosalario,percent;
            Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite seu salário e pressione ENTER: ");
       salario= entrada.nextInt();
        System.out.println("Digite o percentual de aumento e pressione ENTER: ");
      percent= entrada.nextInt();
      
       
       novosalario= salario+ (salario*percent)/100;
       
       
        System.out.println("O valor do aumento foi de: "+percent+"%");
        System.out.println("");
        System.out.println("Seu salário com reajuste de "+percent+" ficou: "+novosalario); 

    }
    
}
