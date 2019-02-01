package Exercicios;
import java.util.Scanner;
public class Exercicio04 {
    
    
    public static void main(String[] args) {
        double salario,novosalario;
            Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite seu salário e pressione ENTER: ");
       salario= entrada.nextInt();
       
       novosalario= salario+ (salario*0.25);
       
       

        System.out.println("Seu salário com reajuste de 25% ficou: "+novosalario); 

    }
    
}
