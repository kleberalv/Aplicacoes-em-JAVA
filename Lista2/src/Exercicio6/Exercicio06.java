package Exercicio6;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio06 {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    DecimalFormat df= new DecimalFormat("0.00");
    Soma soma= new Soma();
    
        System.out.println("Digite a Altura e pressione ENTER: ");
        soma.altura= sc.nextInt(); 
        
        System.out.println("Digite a Base e pressione ENTER: ");
        soma.base= sc.nextInt();  
        
        System.out.println("Retângulo de valores: ");
        System.out.println("Perímetro: "+df.format(soma.Perimetro()));
        System.out.println("Área: " +df.format(soma.Area()));
        System.out.println("Diagonal: "+df.format(soma.Diagonal()));
        
        
    }    
}
