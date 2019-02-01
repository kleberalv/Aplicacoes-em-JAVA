package Exercicio5;
import java.util.Scanner;
public class Exercicio05 {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    Soma soma= new Soma();
    
        System.out.println("Esse programa vai receber o valor em segundos e transformar em horas, minutos e segundos.");
        System.out.println("Digite os segundos e pressione ENTER: ");
        soma.segundos = sc.nextInt();
        
        System.out.println(soma.segundos+" Segundos digitados equivalem a: "+soma.Minutos()+" Minutos.");
        System.out.println(soma.segundos+" Segundos digitados equivalem a: "+soma.Horas()+" Horas.");
        System.out.println("");
    }
    
}
