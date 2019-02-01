package Questoes;
import java.util.Scanner;
public class Questao07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int umNumero;    
       
        System.out.println("Informe o valor de ''umNumero'': ");    
        umNumero=sc.nextInt();
        
        if(umNumero>=0){
            if (umNumero==0){
                System.out.println("\nPrimeira string");
            }else
                System.out.println("\nSegunda string");
                System.out.println("\nTerceira string");
        }
  
    }
    
}
