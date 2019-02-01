package Exercicios;
import java.util.Scanner;
public class Exercicio09 {
    
    
    public static void main(String[] args) {
        int nasc,suaidade,anoatual,ano,resultado;
            Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite o ano de seu nascimento e pressione ENTER: ");
      nasc = entrada.nextInt();
      
        System.out.println("Digite qual o seu ano atual e pressione ENTER: ");
       anoatual = entrada.nextInt();
      
       ano= 2080;
      suaidade= (anoatual-nasc);
      resultado= (ano-nasc);

        System.out.println("O seu nascumento digutado é: "+nasc); 
        System.out.println("O ano atual digitado é: "+anoatual);
        System.out.println("Sua idade é= "+suaidade);
        System.out.println("");
        System.out.println("Sua ideade em 2080 será de: "+resultado);
    }
    
}