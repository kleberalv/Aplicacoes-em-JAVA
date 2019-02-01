package Exercicio09;
import java.util.Scanner;
public class Idade {

    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      Soma soma= new Soma();
       
        System.out.println("Digite seu nascimento para descobrir qual será a sua idade em 2080: ");
        soma.nasc= sc.nextInt();
        System.out.println("Digite o ano atual e pressione ENTER: ");
        soma.anoatual=sc.nextInt();
        
        System.out.println("O seu nascumento digitado é: "+soma.nasc); 
        System.out.println("O ano atual digitado é: "+soma.anoatual);
        System.out.println("Sua idade é= "+soma.CalculoIdade());
        System.out.println("");
        System.out.println("Sua ideade em 2080 será de: "+soma.Resultado() );
        
        
    }
    
}
