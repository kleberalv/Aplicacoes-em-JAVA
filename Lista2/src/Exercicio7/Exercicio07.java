package Exercicio7;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio07 {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    DecimalFormat df= new DecimalFormat("0.00");
    Soma soma= new Soma();
        System.out.println("Digite o valor do Raio e pressione ENTER:  ");
        soma.raio= sc.nextFloat();
        
        System.out.println("A área dessa circuferência é: "+df.format(soma.CalcularArea()));
        System.out.println("O comprimento dessa circuferência é: "+df.format(soma.CalcularComprimento()));
    }
    
}
